package com.github.daniellimadev.microservice.user.service;

import com.github.daniellimadev.microservice.user.entity.User;
import com.github.daniellimadev.microservice.user.producer.UserProducer;
import com.github.daniellimadev.microservice.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
     UserProducer userProducer;

    @Transactional
    public User save(User user) {
        user = userRepository.save(user);
        userProducer.publishMessageEmail(user);
        return user;
    }
}
