package com.microservices.user.service.UserService.service;

import com.microservices.user.service.UserService.controller.UserController;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserService
{
    @Autowired
    private UserController userController;




}
