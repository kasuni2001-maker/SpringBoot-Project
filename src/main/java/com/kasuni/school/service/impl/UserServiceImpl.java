package com.kasuni.school.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kasuni.school.entity.Student;
import com.kasuni.school.entity.User;
import com.kasuni.school.repository.UserRepository;
import com.kasuni.school.service.UserService;

@Service
public class UserServiceImpl implements UserService  {
    private final UserRepository userRepository;
  
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
