package com.wzl.springbootjpa.controller;

import com.wzl.springbootjpa.entity.User;
import com.wzl.springbootjpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable("id") Integer id){
        User one = userRepository.getOne(id);
        return one;
    }

    @GetMapping("/user/save")
    public User saveUser(User user){
        User one = userRepository.save(user);
        return one;
    }
}
