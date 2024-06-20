package com.gryffindor.SQStepByStep.model.dto;

import com.gryffindor.SQStepByStep.model.Timer;
import com.gryffindor.SQStepByStep.model.User;
import java.time.LocalDate;

public class TimerDto {
    private int id;
    private String startDate;
    private String endDate;
    private int durationSeconds;
    private int userId;

    public TimerDto() {}

    public TimerDto(Timer t) {
        this.id = t.getId();
        this.startDate = t.getStartDate().toString();
        this.endDate = t.getEndDate().toString();
        this.durationSeconds = t.getDuration() * 60;
        this.userId = t.getUser().getId();
    }

    public Timer toTimer(User user) {
        return new Timer(LocalDate.parse(this.startDate), LocalDate.parse(this.endDate), (this.durationSeconds / 60), user);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(int durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
