package com.gryffindor.SQStepByStep.model.service.implementation;

import com.gryffindor.SQStepByStep.model.Cigarette;
import com.gryffindor.SQStepByStep.model.Timer;
import com.gryffindor.SQStepByStep.model.User;
import com.gryffindor.SQStepByStep.model.repository.CigaretteRepo;
import com.gryffindor.SQStepByStep.model.repository.TimerRepo;
import com.gryffindor.SQStepByStep.model.service.abstraction.HistoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class HistoryServiceImpl implements HistoryService {
    private final CigaretteRepo cigaretteRepo;
    private final TimerRepo timerRepo;

    @Autowired
    public HistoryServiceImpl(CigaretteRepo cigaretteRepo, TimerRepo timerRepo) {
        this.cigaretteRepo = cigaretteRepo;
        this.timerRepo = timerRepo;
    }

    @Override
    public Cigarette createCigarette(Cigarette cigarette) {
        return cigaretteRepo.save(cigarette);
    }

    @Override
    public Timer createTimer(Timer timer) {
        return timerRepo.save(timer);
    }

    @Override
    public List<Cigarette> getAllCigarettesByUser(User user) {
        return user.getCigs();
    }

    //TODO testalo
    @Override
    public Optional<Cigarette> getLatestCigaretteByUser(User user) {
        return user.getCigs().stream().max((c1, c2) -> c1.getDateTime().compareTo(c2.getDateTime()));
    }

    @Override
    public List<Timer> getAllTimersByUser(User user) {
        return user.getTimers();
    }

    //TODO testalo
    @Override
    public Optional<Timer> getLatestTimerByUser(User user) {
        return user.getTimers().stream().max((t1, t2) -> t1.getStartDate().compareTo(t2.getStartDate()));
    }

}
