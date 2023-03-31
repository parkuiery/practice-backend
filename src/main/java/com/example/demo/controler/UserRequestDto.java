package com.example.demo.controler;

public class UserRequestDto {

    private String accountId;

    private String password;


    public UserRequestDto(String accountId, String password) {
        this.accountId = accountId;
        this.password = password;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getPassword() {
        return password;
    }
}
