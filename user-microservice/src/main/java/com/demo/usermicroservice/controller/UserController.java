
package com.demo.usermicroservice.controller;

import com.demo.usermicroservice.entity.UserEntity;
import com.demo.usermicroservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @GetMapping()
    @ResponseStatus(HttpStatus.OK)
    public List<UserEntity> getAllUser()
    {
        return userRepository.findAll();
    }
    @PostMapping()
    @ResponseStatus(HttpStatus.OK)
    public void createUser(@RequestBody UserEntity userEntity)
    {
        userRepository.save(userEntity);
    }
}