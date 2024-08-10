package com.kuldeepFood.food.ordering.system.response;


import com.kuldeepFood.food.ordering.system.domain.USER_ROLE;
import lombok.Data;

@Data
public class AuthResponse {
	
	private String message;
	private String jwt;
	private USER_ROLE role;
	


}
