package com.kuldeepFood.food.ordering.system.service;

import com.kuldeepFood.food.ordering.system.model.PasswordResetToken;

public interface PasswordResetTokenService {

	public PasswordResetToken findByToken(String token);

	public void delete(PasswordResetToken resetToken);

}
