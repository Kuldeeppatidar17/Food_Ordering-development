package com.kuldeepFood.food.ordering.system.service;

import java.util.List;

import com.kuldeepFood.food.ordering.system.model.Notification;
import com.kuldeepFood.food.ordering.system.model.Order;
import com.kuldeepFood.food.ordering.system.model.Restaurant;
import com.kuldeepFood.food.ordering.system.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
