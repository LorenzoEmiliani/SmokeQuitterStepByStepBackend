package com.gryffindor.SQStepByStep.model;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "timer")
public class Timer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "start_date", nullable = false, columnDefinition = "date")
    private LocalDate startDate;
    @Column(name = "end_date", nullable = false, columnDefinition = "date")
    private LocalDate endDate;
    @Column(nullable = false)
    private int duration;//durata in minuti
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Timer() {}

    public Timer(LocalDate startDate, LocalDate endDate, int duration, User user) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.duration = duration;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public int getDuration() {
        return duration;
    }

    public User getUser() {
        return user;
    }
}
