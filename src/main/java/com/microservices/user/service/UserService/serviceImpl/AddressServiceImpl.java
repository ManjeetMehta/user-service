package com.microservices.user.service.UserService.serviceImpl;

import com.microservices.user.service.UserService.entities.Address;
import com.microservices.user.service.UserService.entities.Hotel;
import com.microservices.user.service.UserService.exceptions.ResourceNotFoundException;
import com.microservices.user.service.UserService.external.HotelService;
import com.microservices.user.service.UserService.repositories.AddressRepository;
import com.microservices.user.service.UserService.service.AddressService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService
{
    Logger logger = LoggerFactory.getLogger(AddressServiceImpl.class);

    @Autowired
    private HotelService hotelService;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Address findbyId(Long id)
    {
        return addressRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("not found"));
    }

    @Override
    public List<Address> findAll() {
      //  ArrayList forObject= restTemplate.getForObject("http://localhost:8082/hotels", ArrayList.class);
      //  logger.info("", forObject);
    logger.info("fetching info");
    Hotel hotel = hotelService.getHotel(1L);
    logger.info("Hotel : "+hotel);
        return addressRepository.findAll();
    }

    @Override
    public Address save(Address address)
    {
        return addressRepository.save(address);
    }

    @Override
    public void getHotelAddress() {
        ArrayList<Hotel> hotels= restTemplate.getForObject("http://localhost:8081/address/hotels", ArrayList.class);
        logger.info("{}", hotels);
        logger.info("fetching info");
//        Hotel hotel = hotelService.getHotel(1L);
 //       logger.info("Hotel : "+hotel);
//        List<Hotel> myhotel = hotels.stream().map()(hotel )
    }
}
