package com.kuldeepFood.food.ordering.system.repository;

import java.util.List;

import com.kuldeepFood.food.ordering.system.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;



public interface NotificationRepository extends JpaRepository<Notification, Long> {

	public List<Notification> findByCustomerId(Long userId);
	public List<Notification> findByRestaurantId(Long restaurantId);

}
