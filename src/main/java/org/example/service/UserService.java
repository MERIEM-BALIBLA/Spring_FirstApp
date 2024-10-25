package org.example.service;

import org.example.model.User;
import java.util.List;
import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    Optional<User> getUserById(Long id);
    Optional<User> getUserByUsername(String username);
    Optional<User> getUserByEmail(String email);
    List<User> getAllUsers();
    User updateUser(User user);
    void deleteUser(Long id);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);

}