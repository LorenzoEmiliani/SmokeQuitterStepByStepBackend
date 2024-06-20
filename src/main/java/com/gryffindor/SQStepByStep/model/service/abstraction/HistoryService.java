package com.gryffindor.SQStepByStep.model.service.abstraction;

import com.gryffindor.SQStepByStep.model.Cigarette;
import com.gryffindor.SQStepByStep.model.Timer;
import com.gryffindor.SQStepByStep.model.User;
import java.util.List;
import java.util.Optional;

public interface HistoryService {
    //CREATE
    Cigarette createCigarette(Cigarette cigarette);
    Timer createTimer(Timer timer);

    //READ
    List<Cigarette> getAllCigarettesByUser(User user);
    Optional<Cigarette> getLatestCigaretteByUser(User user);
    List<Timer> getAllTimersByUser(User user);
    Optional<Timer> getLatestTimerByUser(User user);
}
