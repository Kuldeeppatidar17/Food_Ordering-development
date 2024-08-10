package com.kuldeepFood.food.ordering.system.service;
import com.kuldeepFood.food.ordering.system.Exception.RestaurantException;
import com.kuldeepFood.food.ordering.system.model.IngredientCategory;
import com.kuldeepFood.food.ordering.system.model.IngredientsItem;

import java.util.List;

public interface IngredientsService {
	
	public IngredientCategory createIngredientsCategory(
			String name,Long restaurantId) throws RestaurantException;

	public IngredientCategory findIngredientsCategoryById(Long id) throws Exception;

	public List<IngredientCategory> findIngredientsCategoryByRestaurantId(Long id) throws Exception;
	
	public List<IngredientsItem> findRestaurantsIngredients(
			Long restaurantId);

	
	public IngredientsItem createIngredientsItem(Long restaurantId, 
			String ingredientName,Long ingredientCategoryId) throws Exception;

	public IngredientsItem updateStoke(Long id) throws Exception;
	
}
