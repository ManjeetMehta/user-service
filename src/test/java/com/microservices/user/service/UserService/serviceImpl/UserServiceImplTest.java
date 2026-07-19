package com.microservices.user.service.UserService.serviceImpl;

import com.microservices.user.service.UserService.entities.User;
import com.microservices.user.service.UserService.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest
{
    @Mock
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
        verify(userRepository).save(user);
    }

    @Test
    void fetchAllUser() {
    }

    @Test
    void getUserbyId() {
    }
}