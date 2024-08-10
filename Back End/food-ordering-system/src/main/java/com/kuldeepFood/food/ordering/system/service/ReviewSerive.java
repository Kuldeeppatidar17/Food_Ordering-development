package com.kuldeepFood.food.ordering.system.service;

import java.util.List;

import com.kuldeepFood.food.ordering.system.Exception.ReviewException;
import com.kuldeepFood.food.ordering.system.model.Review;
import com.kuldeepFood.food.ordering.system.model.User;
import com.kuldeepFood.food.ordering.system.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review, User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
