package de.ait.homework_03.service;

import de.ait.homework_03.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getUserById(Long userID);
}
