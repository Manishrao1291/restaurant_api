package com.example.restaurant_management.repo;

import com.example.restaurant_management.model.Admin;
import com.example.restaurant_management.model.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin,Integer> {
}
