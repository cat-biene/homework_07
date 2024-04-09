package de.ait.homework_03.service.impl;

import de.ait.homework_03.model.User;
import de.ait.homework_03.repository.UserRepository;
import de.ait.homework_03.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;


    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }

    @Override
    public User getUserById(Long userID) {
        return repository.findUserById(userID);
    }
}
