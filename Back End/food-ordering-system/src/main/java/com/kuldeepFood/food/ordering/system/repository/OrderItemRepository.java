package com.kuldeepFood.food.ordering.system.repository;

import com.kuldeepFood.food.ordering.system.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
