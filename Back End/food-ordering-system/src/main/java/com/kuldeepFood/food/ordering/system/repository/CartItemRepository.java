package com.kuldeepFood.food.ordering.system.repository;

import com.kuldeepFood.food.ordering.system.model.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
