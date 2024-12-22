package com.microservices.user.service.UserService.controller;

import com.microservices.user.service.UserService.entities.Address;
import com.microservices.user.service.UserService.entities.User;
import com.microservices.user.service.UserService.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController
{
    @Autowired
    private AddressService addressService;

    @GetMapping
    Address findbyId(@PathVariable Long id)
    {
        return addressService.findbyId(id);
    }

    @GetMapping("/hotels")
    void getHotelAddress()
    {
        addressService.getHotelAddress();
    }

    @GetMapping("/hotels-info")
     public ResponseEntity<List<Address>> getUserList()
    {
        List<Address> userList = this.addressService.findAll();
        return ResponseEntity.ok(userList);
    }

    @PostMapping("/save")
    public ResponseEntity<Address> save(@RequestBody Address address)
    {
        Address address1 = addressService.save(address);
        return ResponseEntity.ok(address1);
    }
}
