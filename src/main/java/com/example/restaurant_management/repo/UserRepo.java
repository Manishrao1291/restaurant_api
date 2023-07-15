package com.example.restaurant_management.repo;

import com.example.restaurant_management.model.FoodItem;
import com.example.restaurant_management.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {


    User findFirstByUserEmail(String newEmail);
}
