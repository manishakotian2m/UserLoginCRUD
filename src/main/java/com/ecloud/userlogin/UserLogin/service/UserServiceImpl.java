package com.ecloud.userlogin.UserLogin.service;

import com.ecloud.userlogin.UserLogin.model.User;
import com.ecloud.userlogin.UserLogin.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public User addUser(User user) {
        if(null!= user) {
          //  String username=user.getUsername();
            List<User> users = userRepo.findAll();
//            if()
            userRepo.save(user);
        }
        return null;
    }

    @Override
    public User updateUser(User user) {
      // Optional<User> userToUpdate= userRepo.findById((long) user.getId());
//        userToUpdate= Optional.of(user);
//        userRepo.save(userToUpdate.get());
        return null;
    }

    @Override
    public User deleteUser(String userName) {
//        user
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }
}
