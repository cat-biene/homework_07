package de.ait.homework_03.repository;

import de.ait.homework_03.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();

    User findUserById(Long userID);
}
