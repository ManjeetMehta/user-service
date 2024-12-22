package com.microservices.user.service.UserService.controller;

import com.microservices.user.service.UserService.entities.User;
import com.microservices.user.service.UserService.service.UserService;
import jdk.javadoc.doclet.Reporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController
{
    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<User> createUser(@RequestBody User user)
    {
        User newUser = userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable Long userId)
    {
        System.out.println("I am called");
        User myuser = userService.getUserbyId(userId);
        return ResponseEntity.ok(myuser);
    }


    @GetMapping
    public ResponseEntity<List<User>> getUserList()
    {
        System.out.println("I am called for all ");
        List<User> userList = this.userService.fetchAllUser();
        return ResponseEntity.ok(userList);
    }

    @PatchMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user)
    {
        User newUser = this.userService.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(newUser);
    }

    @GetMapping("/byName/{username}")
    public ResponseEntity<User> findByName(@PathVariable String username)
    {
        System.out.println("username: " + username);
        User user = this.userService.findByName(username);
        return ResponseEntity.ok(user);
    }

}
