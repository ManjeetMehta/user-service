package com.microservices.user.service.UserService.repositories;

import com.microservices.user.service.UserService.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long>
{
}
