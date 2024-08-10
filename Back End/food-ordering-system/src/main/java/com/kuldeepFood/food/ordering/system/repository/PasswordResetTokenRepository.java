package com.kuldeepFood.food.ordering.system.repository;
import com.kuldeepFood.food.ordering.system.model.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
