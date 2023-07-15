package com.example.restaurant_management.controller;

import com.example.restaurant_management.model.User;
import com.example.restaurant_management.model.dto.SignInInput;
import com.example.restaurant_management.model.dto.SignUpOutput;
import com.example.restaurant_management.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user/signup")
    public SignUpOutput signUpPatient(@RequestBody User user)
    {
        return userService.signUpUser(user);
    }

    @PostMapping("user/signIn")
    public String sigInPatient(@RequestBody @Valid SignInInput signInInput)
    {
        return userService.signInUser(signInInput);
    }

    @GetMapping("users")
    List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @PostMapping("user")
    public  void  addUser(@RequestBody User user){
        userService.addUser(user);
    }

}
