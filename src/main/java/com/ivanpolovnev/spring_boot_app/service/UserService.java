package com.ivanpolovnev.spring_boot_app.service;


import com.ivanpolovnev.spring_boot_app.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    void save(User user);

    User findOne(Long id);

    void update(User user);

    void delete(Long id);
}