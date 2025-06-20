package com.crk.backend.service.impl;


import com.crk.backend.model.entity.User;
import com.crk.backend.repository.UserRepository;
import com.crk.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void register(User user){
        userRepository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return null;
    }

    @Override
    public User findById(String id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        return null;
    }
}
