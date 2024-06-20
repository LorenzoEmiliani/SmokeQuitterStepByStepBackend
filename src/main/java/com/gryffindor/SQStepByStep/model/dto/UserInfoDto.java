package com.gryffindor.SQStepByStep.model.dto;

import com.gryffindor.SQStepByStep.model.User;

public class UserInfoDto {

    private String username;

    private String firstname;

    private String lastname;

    private String email;

    private int age;

    private char gender;

    private String subscriptionDate;

    private boolean stillSmoker;

    private int startingDailyCigNums;//costante

    private String eachCigPrice;

    private int dailyCigNum;

    public UserInfoDto(){}

    public UserInfoDto(User user) {
        this.username = user.getUsername();
        this.firstname = user.getFirstname();
        this.lastname = user.getLastname();
        this.email = user.getEmail();
        this.age = user.getAge();
        this.gender = user.getGender();
        this.subscriptionDate = user.getSubscriptionDate().toString();
        this.stillSmoker = user.isStillSmoker();
        this.startingDailyCigNums = user.getStartingDailyCigNums();
        this.eachCigPrice = user.getEachCigPrice().toString();
        this.dailyCigNum = user.getDailyCigNum();
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getSubscriptionDate() {
        return subscriptionDate;
    }

    public void setSubscriptionDate(String subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public boolean isStillSmoker() {
        return stillSmoker;
    }

    public void setStillSmoker(boolean stillSmoker) {
        this.stillSmoker = stillSmoker;
    }

    public int getStartingDailyCigNums() {
        return startingDailyCigNums;
    }

    public void setStartingDailyCigNums(int startingDailyCigNums) {
        this.startingDailyCigNums = startingDailyCigNums;
    }

    public String getEachCigPrice() {
        return eachCigPrice;
    }

    public void setEachCigPrice(String eachCigPrice) {
        this.eachCigPrice = eachCigPrice;
    }

    public int getDailyCigNum() {
        return dailyCigNum;
    }

    public void setDailyCigNum(int dailyCigNum) {
        this.dailyCigNum = dailyCigNum;
    }
}


