package de.ait.homework_03.repository.impl;

import de.ait.homework_03.model.User;
import de.ait.homework_03.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {

    List<User> users = List.of(
            new User(1L, "Jack", "Jack123", "email@.email.de", 35),
        new User(2L, "Emily", "Emily456", "emily@example.com", 28),
        new User(3L, "John", "John789", "john@example.com", 42),
        new User(4L, "Alice", "Alice321", "alice@example.com", 30),
        new User(5L, "Bob", "Bob654", "bob@example.com", 45),
        new User(6L, "Emma", "Emma987", "emma@example.com", 22),
        new User(7L, "Michael", "Michael123", "michael@example.com", 38),
        new User(8L, "Sophia", "Sophia456", "sophia@example.com", 27),
        new User(9L, "William", "William789", "william@example.com", 50),
        new User(10L, "Olivia", "Olivia321", "olivia@example.com", 33)

    );

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findUserById(Long userID) {
        return findAll().stream()
                .filter(user -> user.getId().equals(userID))
                .findFirst()
                .get();
    }

}
