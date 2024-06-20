package com.gryffindor.SQStepByStep.model.dto;


import com.gryffindor.SQStepByStep.model.User;

import java.math.BigDecimal;
import java.time.LocalDate;

public class UserDto {

    private int id;

    private String username;

    private String firstname;

    private String lastname;

    private String email;

    private String password;

    private int age;

    private char gender;

    private String subscriptionDate;

    private boolean stillSmoker;

    private int startingDailyCigNums;//costante

    private String eachCigPrice;

    private int dailyCigNum;

    public UserDto (){

    }
    public UserDto(User user){
      this.id = user.getId();
      this.username = user.getUsername();
      this.firstname = user.getFirstname();
      this.lastname = user.getLastname();
      this.email = user.getEmail();
      this.password = user.getPassword();
      this.age = user.getAge();
      this.gender = user.getGender();
      this.subscriptionDate = user.getSubscriptionDate().toString();
      this.stillSmoker = user.isStillSmoker();
      this.startingDailyCigNums = user.getStartingDailyCigNums();
      this.eachCigPrice = user.getEachCigPrice().toString();
      this.dailyCigNum = user.getDailyCigNum();
    }

    public User toUser(){
      return new User(
                this.id, this.username, this.firstname, this.lastname, this.email, this.password,
                this.age, this.gender, LocalDate.parse(this.subscriptionDate),this.stillSmoker,
                this.startingDailyCigNums, new BigDecimal(eachCigPrice), this.dailyCigNum
        );
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setSubscriptionDate(String subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public void setStillSmoker(boolean stillSmoker) {
        this.stillSmoker = stillSmoker;
    }

    public void setStartingDailyCigNums(int startingDailyCigNums) {
        this.startingDailyCigNums = startingDailyCigNums;
    }

    public void setEachCigPrice(String eachCigPrice) {
        this.eachCigPrice = eachCigPrice;
    }

    public void setDailyCigNum(int dailyCigNum) {
        this.dailyCigNum = dailyCigNum;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public String getSubscriptionDate() {
        return subscriptionDate;
    }

    public boolean isStillSmoker() {
        return stillSmoker;
    }

    public int getStartingDailyCigNums() {
        return startingDailyCigNums;
    }

    public String getEachCigPrice() {
        return eachCigPrice;
    }

    public int getDailyCigNum() {
        return dailyCigNum;
    }
}
