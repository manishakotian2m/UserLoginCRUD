package com.ecloud.userlogin.UserLogin.controller;

import com.ecloud.userlogin.UserLogin.model.User;
import com.ecloud.userlogin.UserLogin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

@Autowired
private UserService userService;


    @PostMapping(name= "/addUser")
    public User addUser(@RequestBody User user) {
        User response=userService.addUser(user);
        return response;
    }

    @GetMapping(name= "/getUser/{username}")
    public User getUser(@PathVariable String user) {
        User response=userService.getUserByUsername(user);
        return response;
    }

    @PostMapping(name= "/updateUser")
    public User getUser(@RequestBody User user) {
        User response=userService.updateUser(user);
        return response;
    }

    @DeleteMapping(name= "/deleteUser/{username}")
    public String deleteUser(@PathVariable String user) {
        userService.deleteUser(user);
        return "Deleetd User";
    }

    @GetMapping(name= "/getUsers")
    public List<User> getAllUser() {
        List<User> response=userService.getAllUsers();
        return response;
    }
}
