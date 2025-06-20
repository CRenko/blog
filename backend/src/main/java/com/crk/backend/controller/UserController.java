package com.crk.backend.controller;


import com.crk.backend.model.entity.User;
import com.crk.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        userService.register(user);
        return user;
    }

    @GetMapping("/getuserby{id}")
    public User findById(@RequestParam String id){
        return userService.findById(id);
    }

}
