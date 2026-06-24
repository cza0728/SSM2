package org.example.ch111.controller;

import org.example.ch111.pojo.User;
import org.example.ch111.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Usercontroller {
    @Autowired
    UserService userService;
    @GetMapping("/select")
    public User select(@RequestParam String id){
        return userService.getById(id);

    }

}
