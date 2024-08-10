package com.kuldeepFood.food.ordering.system.service;


import com.kuldeepFood.food.ordering.system.Exception.CartException;
import com.kuldeepFood.food.ordering.system.Exception.CartItemException;
import com.kuldeepFood.food.ordering.system.Exception.FoodException;
import com.kuldeepFood.food.ordering.system.Exception.UserException;
import com.kuldeepFood.food.ordering.system.model.Cart;
import com.kuldeepFood.food.ordering.system.model.CartItem;
import com.kuldeepFood.food.ordering.system.request.AddCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
