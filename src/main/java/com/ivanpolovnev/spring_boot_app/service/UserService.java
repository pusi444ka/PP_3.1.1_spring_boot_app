package com.ivanpolovnev.spring_boot_app.service;


import com.ivanpolovnev.spring_boot_app.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void save(User user);

    User getUserById(Long id);

    void update(User user);

    void delete(Long id);
}