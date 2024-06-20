package com.gryffindor.SQStepByStep.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "app_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username", nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = true)
    private int age;
    @Column(nullable = true)
    private char gender;
    @Column(name = "subscription_date", nullable = false, columnDefinition = "date")
    private LocalDate subscriptionDate;
    @Column(name = "still_smoker", nullable = false)
    private boolean stillSmoker;
    @Column(name = "starting_daily_cig_nums", nullable = false)
    private int startingDailyCigNums;//costante
    @Column(name = "each_cig_price", nullable = false)
    private BigDecimal eachCigPrice;
    @Column(name = "daily_cig_num", nullable = false)
    private int dailyCigNum;
    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Timer> timers;
    @OneToMany(mappedBy = "user", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Cigarette> cigs;



//TODO ricorda nel DTO di trasformare eachCigPrice in STRINGA!!!!

    public User(){}

    public User(int id, String username, String firstname, String lastname, String email, String password, int age, char gender, LocalDate subscriptionDate, boolean stillSmoker, int startingDailyCigNums, BigDecimal eachCigPrice, int dailyCigNum) {
        this.id = id;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.subscriptionDate = subscriptionDate;
        this.stillSmoker = stillSmoker;
        this.startingDailyCigNums = startingDailyCigNums;
        this.eachCigPrice = eachCigPrice;
        this.dailyCigNum = dailyCigNum;
    }

    public int decrementDailyCigNum() {
        this.dailyCigNum--;
        return this.dailyCigNum;
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

    public List<Cigarette> getCigs() {
        return cigs;
    }

    public List<Timer> getTimers() {
        return timers;
    }

    public LocalDate getSubscriptionDate() {
        return subscriptionDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public boolean isStillSmoker() {
        return stillSmoker;
    }

    public int getDailyCigNum() {
        return dailyCigNum;
    }

    public int getStartingDailyCigNums() {
        return startingDailyCigNums;
    }


    public BigDecimal getEachCigPrice() {
        return eachCigPrice;
    }
}
