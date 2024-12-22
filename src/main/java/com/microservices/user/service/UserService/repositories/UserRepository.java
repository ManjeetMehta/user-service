package com.microservices.user.service.UserService.repositories;

import com.microservices.user.service.UserService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
//    @Query(value = "SELECT * FROM users WHERE name = ?1", nativeQuery = true)
//    User findByName(String name);


}
