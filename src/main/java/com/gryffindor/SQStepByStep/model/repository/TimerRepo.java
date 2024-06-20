package com.gryffindor.SQStepByStep.model.repository;

import com.gryffindor.SQStepByStep.model.Timer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimerRepo extends JpaRepository<Timer, Integer> { }