package com.gryffindor.SQStepByStep.model.service.implementation;

import com.gryffindor.SQStepByStep.model.User;
import com.gryffindor.SQStepByStep.model.repository.UserRepo;
import com.gryffindor.SQStepByStep.model.service.abstraction.AbstractUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserServiceImpl implements AbstractUserService {
    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public Optional<User> getUserById(int id) {
        return userRepo.findById(id);
    }

    @Override
    public User getUserByUserName(String userName) {
        return userRepo.findByUsername(userName);
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    @Override
    public User updateUserUserName(User user, String userName) {
        return null;
    }

    @Override
    public User updateUserEmail(User user, String email) {
        return null;
    }

    @Override
    public void deleteUser(User user) {

    }


}
