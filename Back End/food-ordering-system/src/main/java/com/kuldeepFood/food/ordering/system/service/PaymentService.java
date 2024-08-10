package com.kuldeepFood.food.ordering.system.service;

import com.kuldeepFood.food.ordering.system.model.Order;
import com.kuldeepFood.food.ordering.system.model.PaymentResponse;
import com.stripe.exception.StripeException;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
