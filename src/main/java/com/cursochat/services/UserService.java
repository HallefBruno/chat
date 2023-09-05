package com.cursochat.services;

import com.cursochat.data.User;
import com.cursochat.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findChatUsers(){
        return userRepository.findAll();
    }
}
