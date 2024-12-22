package com.microservices.user.service.UserService.service;

import com.microservices.user.service.UserService.entities.User;

import java.util.List;

public interface UserService
{
    User save(User user);

    List<User> fetchAllUser();

    User getUserbyId(Long userId);

    User update(User user);

    User findByName(String username);
}
