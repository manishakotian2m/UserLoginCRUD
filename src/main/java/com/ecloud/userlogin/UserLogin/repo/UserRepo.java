package com.ecloud.userlogin.UserLogin.repo;

import com.ecloud.userlogin.UserLogin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    @Query(name="select u from User u where u.userName = :username")
    public User findByUsername(@Param("username")String username);
}
