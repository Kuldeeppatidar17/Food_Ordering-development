package com.kuldeepFood.food.ordering.system.service;

import com.kuldeepFood.food.ordering.system.Exception.FoodException;
import com.kuldeepFood.food.ordering.system.Exception.RestaurantException;
import com.kuldeepFood.food.ordering.system.model.Category;
import com.kuldeepFood.food.ordering.system.model.Food;
import com.kuldeepFood.food.ordering.system.model.Restaurant;
import com.kuldeepFood.food.ordering.system.request.CreateFoodRequest;

import java.util.List;


public interface FoodService {

	public Food createFood(CreateFoodRequest req, Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
