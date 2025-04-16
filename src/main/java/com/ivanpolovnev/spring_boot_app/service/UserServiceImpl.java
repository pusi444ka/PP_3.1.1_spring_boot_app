package com.ivanpolovnev.spring_boot_app.service;

import com.ivanpolovnev.spring_boot_app.dao.UserRepository;
import com.ivanpolovnev.spring_boot_app.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }

    @Override
    public User findOne(Long id) {

        User user = null;
        Optional<User> optional = userRepository.findById(id);
        if(optional.isPresent()){
            user = optional.get();
        }

        return user;
    }

    @Override
    public void update(User user) {
        userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}