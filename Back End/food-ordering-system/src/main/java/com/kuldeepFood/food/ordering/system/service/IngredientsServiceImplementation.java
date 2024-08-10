package com.kuldeepFood.food.ordering.system.service;

import java.util.List;
import java.util.Optional;

import com.kuldeepFood.food.ordering.system.Exception.RestaurantException;
import com.kuldeepFood.food.ordering.system.model.IngredientCategory;
import com.kuldeepFood.food.ordering.system.model.IngredientsItem;
import com.kuldeepFood.food.ordering.system.model.Restaurant;
import com.kuldeepFood.food.ordering.system.repository.IngredientsCategoryRepository;
import com.kuldeepFood.food.ordering.system.repository.IngredientsItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngredientsServiceImplementation implements IngredientsService {

	@Autowired
	private IngredientsCategoryRepository ingredientsCategoryRepo;
	
	@Autowired
	private IngredientsItemRepository ingredientsItemRepository;
	
	
	
	@Autowired
	private RestaurantService restaurantService;
	
	@Override
	public IngredientCategory createIngredientsCategory(
			String name,Long restaurantId) throws RestaurantException {
		
		IngredientCategory isExist=ingredientsCategoryRepo
				.findByRestaurantIdAndNameIgnoreCase(restaurantId,name);
		
		if(isExist!=null) {
			return isExist;
		}

		Restaurant restaurant=restaurantService.findRestaurantById(restaurantId);
		
		IngredientCategory ingredientCategory=new IngredientCategory();
		ingredientCategory.setRestaurant(restaurant);
		ingredientCategory.setName(name);
		
		IngredientCategory createdCategory = ingredientsCategoryRepo.save(ingredientCategory);
		
		return createdCategory;
	}

	@Override
	public IngredientCategory findIngredientsCategoryById(Long id) throws Exception {
		Optional<IngredientCategory> opt=ingredientsCategoryRepo.findById(id);
		if(opt.isEmpty()){
			throw new Exception("ingredient category not found");
		}
		return opt.get();
	}

	@Override
	public List<IngredientCategory> findIngredientsCategoryByRestaurantId(Long id) throws Exception {
		return ingredientsCategoryRepo.findByRestaurantId(id);
	}

	@Override
	public List<IngredientsItem> findRestaurantsIngredients(Long restaurantId) {

		return ingredientsItemRepository.findByRestaurantId(restaurantId);
	}
	

	@Override
	public IngredientsItem createIngredientsItem(Long restaurantId, 
			String ingredientName, Long ingredientCategoryId) throws Exception {
		
		IngredientCategory category = findIngredientsCategoryById(ingredientCategoryId);
		
		IngredientsItem isExist = ingredientsItemRepository.
				findByRestaurantIdAndNameIngoreCase(restaurantId, ingredientName,category.getName());
		if(isExist!=null) {
			System.out.println("is exists-------- item");
			return isExist;
		}
		
		Restaurant restaurant=restaurantService.findRestaurantById(
				restaurantId);
		IngredientsItem item=new IngredientsItem();
		item.setName(ingredientName);
		item.setRestaurant(restaurant);
		item.setCategory(category);
		
		IngredientsItem savedIngredients = ingredientsItemRepository.save(item);
		category.getIngredients().add(savedIngredients);

		return savedIngredients;
	}


	@Override
	public IngredientsItem updateStoke(Long id) throws Exception {
		Optional<IngredientsItem> item=ingredientsItemRepository.findById(id);
		if(item.isEmpty()) {
			throw new Exception("ingredient not found with id "+item);
		}
		IngredientsItem ingredient=item.get();
		ingredient.setInStoke(!ingredient.isInStoke());
		return ingredientsItemRepository.save(ingredient);
	}

	

	

}
