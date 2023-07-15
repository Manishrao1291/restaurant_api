package com.example.restaurant_management.repo;

import com.example.restaurant_management.model.AuthenticationToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthTokenRepo extends JpaRepository<AuthenticationToken,Long> {

    AuthenticationToken findFirstByTokenValue(String authTokenValue);
}
