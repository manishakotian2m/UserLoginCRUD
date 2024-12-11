package com.ecloud.userlogin.UserLogin.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Getter
public class User {
    @Id
    private int id;
    private String username;
    private String password;
    private boolean isActive;
}
