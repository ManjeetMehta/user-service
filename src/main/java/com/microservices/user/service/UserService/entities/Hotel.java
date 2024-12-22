package com.microservices.user.service.UserService.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Hotel
{
    private Long id;
    private String name;
    private String location;
    private String about;
}