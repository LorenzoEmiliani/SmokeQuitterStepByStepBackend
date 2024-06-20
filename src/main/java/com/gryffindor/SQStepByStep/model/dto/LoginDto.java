package com.gryffindor.SQStepByStep.model.dto;

public class LoginDto {

    private String username;

    private String password;

    public LoginDto(){}

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
