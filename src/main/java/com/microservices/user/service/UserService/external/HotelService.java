package com.microservices.user.service.UserService.external;


import com.microservices.user.service.UserService.entities.Hotel;
import jakarta.ws.rs.Path;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="localhost:8082")
public interface HotelService
{
    @GetMapping("/hotels/{hotelId}")
    Hotel getHotel(@PathVariable ("hotelId") Long hotelId);
}
