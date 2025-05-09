package com.ivanpolovnev.spring_boot_app.controllers;

import com.ivanpolovnev.spring_boot_app.entity.User;
import com.ivanpolovnev.spring_boot_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public String listUsers(Model model) {
        model.addAttribute("users", userService.findAllUsers());
        return "listUsers";
    }

    @GetMapping("/edit/{id}")
    public String getEditView(@PathVariable("id") Long id, Model model) {
        User user = userService.findUserById(id);
        model.addAttribute("user", user);
        return "edit";
    }

    @PostMapping("/{id}")
    public String editModel(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/users/list";
    }

    @PostMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.removeUserById(id);
        return "redirect:/users/list";
    }

    @PostMapping("/new")
    public String showCreateUserForm(@ModelAttribute("user") User user) {
        return "/users/new";
    }

    @PostMapping
    public String createUser(@ModelAttribute("user") User user) {
        userService.createUser(user);
        return "redirect:/users/list";
    }
}
