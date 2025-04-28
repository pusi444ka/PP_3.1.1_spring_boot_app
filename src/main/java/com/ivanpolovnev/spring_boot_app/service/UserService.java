package com.ivanpolovnev.spring_boot_app.service;


import com.ivanpolovnev.spring_boot_app.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void createUser(User user);

    User findUserById(Long id);

    void updateUser(User user);

    void deleteUserById(Long id);
}