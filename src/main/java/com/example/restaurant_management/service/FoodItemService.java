package com.example.restaurant_management.service;

import com.example.restaurant_management.model.FoodItem;
import com.example.restaurant_management.repo.FoodItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoodItemService {
    @Autowired
    FoodItemRepo foodItemRepo;


    public void addFood(FoodItem foodItem) {
        foodItemRepo.save(foodItem);
    }
}
