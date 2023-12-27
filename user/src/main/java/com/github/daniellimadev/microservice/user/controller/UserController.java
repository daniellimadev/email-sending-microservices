package com.github.daniellimadev.microservice.user.controller;

import com.github.daniellimadev.microservice.user.DTOs.UserRecordDTO;
import com.github.daniellimadev.microservice.user.entity.User;
import com.github.daniellimadev.microservice.user.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/users")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRecordDTO userRecordDTO) {
        var user = new User();
        BeanUtils.copyProperties(userRecordDTO, user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }

}
