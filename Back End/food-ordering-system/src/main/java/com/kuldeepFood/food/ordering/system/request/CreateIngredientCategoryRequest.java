package com.kuldeepFood.food.ordering.system.request;
import lombok.Data;

@Data
public class CreateIngredientCategoryRequest {

    private Long restaurantId;
    private String name;
}
