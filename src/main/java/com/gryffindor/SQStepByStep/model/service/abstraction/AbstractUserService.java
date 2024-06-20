package com.gryffindor.SQStepByStep.model.service.abstraction;

import com.gryffindor.SQStepByStep.model.User;

import java.util.Optional;


public interface AbstractUserService {
    //CREATE
    User createUser(User user);
    //READ
    Optional<User> getUserById(int id);
    User getUserByUserName(String userName);
    User getUserByEmail(String email);
    //UPDATE
    User updateUserUserName(User user, String userName);
    User updateUserEmail(User user, String email);
    //TODO updatePassword() ???
    //DELETE
    void deleteUser(User user);
}
