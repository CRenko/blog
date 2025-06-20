package com.crk.backend.service;

import com.crk.backend.model.entity.User;

public interface UserService {
    void register(User user);
    User findByUsername(String username);
    User findById(String id);
    User findByUsernameAndPassword(String username,String password);
}
