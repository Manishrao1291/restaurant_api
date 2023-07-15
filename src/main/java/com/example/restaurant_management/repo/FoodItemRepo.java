package com.example.restaurant_management.repo;

import com.example.restaurant_management.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodItemRepo extends JpaRepository<FoodItem,Integer> {
}
