package com.kuldeepFood.food.ordering.system.repository;
import java.util.Optional;

import com.kuldeepFood.food.ordering.system.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CartRepository extends JpaRepository<Cart, Long> {

	 Optional<Cart> findByCustomer_Id(Long userId);
}
