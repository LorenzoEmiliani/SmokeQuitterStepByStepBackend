package com.gryffindor.SQStepByStep.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cigarette")
public class Cigarette {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "date_time", nullable = false, columnDefinition = "timestamp without time zone")
    private LocalDateTime dateTime;
    @Column(nullable = false)
    private String description;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Cigarette() {}

    public Cigarette(LocalDateTime dateTime, String description, User user) {
        this.dateTime = dateTime;
        this.description = description;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDescription() {
        return description;
    }

    public User getUser() {
        return user;
    }


}
