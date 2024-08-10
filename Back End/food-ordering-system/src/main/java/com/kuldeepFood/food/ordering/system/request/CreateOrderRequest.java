package com.kuldeepFood.food.ordering.system.request;



import com.kuldeepFood.food.ordering.system.model.Address;
import lombok.Data;

@Data
public class CreateOrderRequest {
 
	private Long restaurantId;
	
	private Address deliveryAddress;
	
    
}
