package com.microservices.user.service.UserService.service;

import com.microservices.user.service.UserService.entities.Address;

import java.util.List;

public interface AddressService
{
    Address findbyId(Long id);

    List<Address> findAll();

    Address save(Address address);

    void getHotelAddress() ;
}
