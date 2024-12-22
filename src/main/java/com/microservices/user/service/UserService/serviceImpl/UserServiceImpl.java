package com.microservices.user.service.UserService.serviceImpl;

import com.microservices.user.service.UserService.entities.User;
import com.microservices.user.service.UserService.exceptions.ResourceNotFoundException;
import com.microservices.user.service.UserService.repositories.UserRepository;
import com.microservices.user.service.UserService.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService
{

    Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user)
    {
        return userRepository.save(user);
    }

    @Override
    public List<User> fetchAllUser()
    {
        return userRepository.findAll();
    }

    @Override
    public User getUserbyId(Long userId)
    {
        System.out.println("get user called ");
        return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("user does not exist :"+ userId));
    }

    @Override
    public User update(User user)
    {
        return userRepository.save(user);
    }

    @Override
    public User findByName(String username)
    {
        logger.info("find by name call ");
        return null;
    //    return userRepository.findByName(username);
    }
}