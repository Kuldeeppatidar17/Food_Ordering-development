package com.kuldeepFood.food.ordering.system.service;

import com.kuldeepFood.food.ordering.system.Exception.RestaurantException;
import com.kuldeepFood.food.ordering.system.model.Category;

import java.util.List;

public interface CategoryService {
	
	public Category createCategory (String name, Long userId) throws RestaurantException;
	public List<Category> findCategoryByRestaurantId(Long restaurantId) throws RestaurantException;
	public Category findCategoryById(Long id) throws RestaurantException;

}
