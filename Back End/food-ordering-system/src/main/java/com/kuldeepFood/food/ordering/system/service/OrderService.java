package com.kuldeepFood.food.ordering.system.service;

import java.util.List;

import com.kuldeepFood.food.ordering.system.Exception.CartException;
import com.kuldeepFood.food.ordering.system.Exception.OrderException;
import com.kuldeepFood.food.ordering.system.Exception.RestaurantException;
import com.kuldeepFood.food.ordering.system.Exception.UserException;
import com.kuldeepFood.food.ordering.system.model.Order;
import com.kuldeepFood.food.ordering.system.model.PaymentResponse;
import com.kuldeepFood.food.ordering.system.model.User;
import com.kuldeepFood.food.ordering.system.request.CreateOrderRequest;
import com.stripe.exception.StripeException;
public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
