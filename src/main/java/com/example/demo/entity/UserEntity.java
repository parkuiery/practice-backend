package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountId;

    private String password;


    public UserEntity(String accountId, String password) {
        this.accountId = accountId;
        this.password = password;
    }

    public UserEntity() {

    }

    public String getAccountId() {
        return accountId;
    }

    public String getPassword() {
        return password;
    }
}
