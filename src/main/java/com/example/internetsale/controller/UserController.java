package com.example.internetsale.controller;

import com.example.internetsale.dto.UserDto;
import com.example.internetsale.model.User;
import com.example.internetsale.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping
    public List<UserDto> user(@RequestParam(name = "firstname", required = false) String firstname){
        return userService.listUser(firstname);
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User newUser){
        return userService.saveUser(newUser);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User newUser, @PathVariable Long id) {
        return userService.updateUser(id, newUser);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteItem(id);
    }
}
