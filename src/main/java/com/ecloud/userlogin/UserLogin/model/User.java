package com.ecloud.userlogin.UserLogin.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Getter
public class User {
    @Id
    private Long id;
    private String username;
    private String password;
    private boolean isActive;
}
