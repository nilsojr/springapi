package com.islandsoftware.springapi.services;

import com.islandsoftware.springapi.entities.User;
import com.islandsoftware.springapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id)
    {
        var user = userRepository.findById(id);
        return user.get();
    }
}
