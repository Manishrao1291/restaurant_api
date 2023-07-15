package com.example.restaurant_management.controller;

import com.example.restaurant_management.model.FoodItem;
import com.example.restaurant_management.service.FoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodItemController {
    @Autowired
    FoodItemService foodItemService;

    @PostMapping("food")
    public void addFood(@RequestBody FoodItem foodItem){
        foodItemService.addFood(foodItem);
    }

}
