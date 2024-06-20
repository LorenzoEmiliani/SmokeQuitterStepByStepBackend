package com.gryffindor.SQStepByStep.model.dto;

import com.gryffindor.SQStepByStep.model.Cigarette;
import com.gryffindor.SQStepByStep.model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class CigaretteDto {
    private int id;
    private String date;
    private String time;
    private String description;
    private int userId;

    public CigaretteDto() {}

    public CigaretteDto(Cigarette c) {
        this.id = c.getId();
        this.date = c.getDateTime().toLocalDate().toString();
        this.time = c.getDateTime().toLocalTime().toString();
        this.description = c.getDescription();
        this.userId = c.getUser().getId();
    }

    public Cigarette toCigarette(User user) {
        return new Cigarette(LocalDateTime.of(LocalDate.parse(this.date), LocalTime.parse(this.time)), this.description, user);
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public int getUserId() {
        return userId;
    }
}
