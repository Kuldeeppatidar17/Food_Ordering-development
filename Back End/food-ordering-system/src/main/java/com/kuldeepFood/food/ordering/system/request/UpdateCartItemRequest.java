package com.kuldeepFood.food.ordering.system.request;
import lombok.Data;

@Data
public class UpdateCartItemRequest {
	
	private Long cartItemId;
	private int quantity;

}
