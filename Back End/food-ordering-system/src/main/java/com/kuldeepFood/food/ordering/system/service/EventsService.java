package com.kuldeepFood.food.ordering.system.service;

import java.util.List;

import com.kuldeepFood.food.ordering.system.Exception.RestaurantException;
import com.kuldeepFood.food.ordering.system.model.Events;

public interface EventsService {
	
	public Events createEvent(Events event,Long restaurantId) throws RestaurantException;
	
	public List<Events> findAllEvent();
	
	public List<Events> findRestaurantsEvent(Long id);
	
	public void deleteEvent(Long id) throws Exception;
	
	public Events findById(Long id) throws Exception;

}
