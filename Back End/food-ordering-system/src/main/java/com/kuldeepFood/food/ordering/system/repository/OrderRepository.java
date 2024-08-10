package com.kuldeepFood.food.ordering.system.repository;
import java.util.List;
import java.util.Optional;

import com.kuldeepFood.food.ordering.system.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface OrderRepository extends JpaRepository<Order,Long> {
	@Query("SELECT o FROM Order o WHERE o.customer.id = :userId")
	List<Order> findAllUserOrders(@Param("userId")Long userId);
    
	@Query("SELECT o FROM Order o WHERE o.restaurant.id = :restaurantId")
	List<Order> findOrdersByRestaurantId(@Param("restaurantId") Long restaurantId);
}
