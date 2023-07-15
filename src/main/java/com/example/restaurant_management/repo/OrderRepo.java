package com.example.restaurant_management.repo;

import com.example.restaurant_management.model.FoodItem;
import com.example.restaurant_management.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order,Integer> {
}
