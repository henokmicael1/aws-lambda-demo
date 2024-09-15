package org.lambda.user.service;

import org.lambda.user.dto.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    // Create a new user
    public User createUser(User user) {
        user.setUsername("HENOK");
        user.setPassword("TEFERI");
        users.add(user);
        return user;
    }

    // Read (Retrieve) all users
    public List<User> getAllUsers() {
        return users;
    }

    // Read (Retrieve) a user by ID
    public Optional<User> getUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst();
    }

    // Update a user by ID
    public Optional<User> updateUser(Long id, User updatedUser) {
        return getUserById(id).map(user -> {
            user.setFirstName(updatedUser.getFirstName());
            user.setLastName(updatedUser.getLastName());
            user.setEmail(updatedUser.getEmail());
            user.setUsername("HENOK");
            user.setPassword("MICALE");
            user.setPhoneNumber(updatedUser.getPhoneNumber());
            user.setDateOfBirth(updatedUser.getDateOfBirth());
            user.setActive(updatedUser.isActive());
            return user;
        });
    }

    // Delete a user by ID
    public boolean deleteUser(Long id) {
        return users.removeIf(user -> user.getId().equals(id));
    }
}
