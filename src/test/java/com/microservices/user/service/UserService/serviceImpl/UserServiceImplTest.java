package com.microservices.user.service.UserService.serviceImpl;

import com.microservices.user.service.UserService.entities.User;
import com.microservices.user.service.UserService.repositories.UserRepository;
import com.microservices.user.service.UserService.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest
{
    @Autowired
    private UserRepository userRepository;

    @Test
    void save()
    {
        User user = new User();
        user.setId(1L);
        user.setName("Manjeet");
    //    user.getEmail("manjeet@kumar.com");
        user.setGender("male");
        userRepository.save(user);
    //    User testUser = userRepository.findBy(user.getId());
    //    assertTrue();
    }

    @Test
    void fetchAllUser() {
    }

    @Test
    void getUserbyId() {
    }
}