package com.ecloud.userlogin.UserLogin.service;

import com.ecloud.userlogin.UserLogin.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public User addUser(User user);
    public User updateUser(User user);
    public void deleteUser(String userName);
    public List<User> getAllUsers();
    public User getUser(int id);
    public User getUserByUsername(String username);
}
