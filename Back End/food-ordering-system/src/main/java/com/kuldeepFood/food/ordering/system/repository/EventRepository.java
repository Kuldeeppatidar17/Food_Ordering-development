package com.kuldeepFood.food.ordering.system.repository;
import java.util.List;

import com.kuldeepFood.food.ordering.system.model.Events;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EventRepository extends JpaRepository<Events, Long>{

	public List<Events> findEventsByRestaurantId(Long id);
}
