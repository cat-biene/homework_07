package de.ait.homework_03.controller;

import de.ait.homework_03.model.User;
import de.ait.homework_03.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService service;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/users/{userID}")
    public User getUserById(@PathVariable Long userID) {
        return service.getUserById(userID);
    }

}
