package com.ivanpolovnev.spring_boot_app.dao;


import com.ivanpolovnev.spring_boot_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}