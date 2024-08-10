package com.kuldeepFood.food.ordering.system.repository;
import java.util.List;
import java.util.Optional;

import com.kuldeepFood.food.ordering.system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface UserRepository extends JpaRepository<User, Long> {
	
	
	
	@Query("SELECT u FROM User u Where u.status='PENDING'")
	public List<User> getPenddingRestaurantOwners();
	
	public User findByEmail(String username);

}
