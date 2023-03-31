package com.example.demo.controler;

public class UserResponseDto {

    private String accountId;

    private String password;

    public UserResponseDto(String accountId, String password) {
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
