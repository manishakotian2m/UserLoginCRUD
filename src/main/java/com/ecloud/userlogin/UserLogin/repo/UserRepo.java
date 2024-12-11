package com.ecloud.userlogin.UserLogin.repo;

import com.ecloud.userlogin.UserLogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
