package com.ivanpolovnev.spring_boot_app.service;


import com.ivanpolovnev.spring_boot_app.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    void createUser(User user);

    User findUserById(Long id);

    void updateUser(User user);

    void removeUserById(Long id);
}