package com.kuldeepFood.food.ordering.system.repository;
import java.util.List;

import com.kuldeepFood.food.ordering.system.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {

	public List<Category> findByRestaurantId(Long id);
}
