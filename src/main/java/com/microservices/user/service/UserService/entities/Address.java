package com.microservices.user.service.UserService.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="address")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "SequenceAddressId", sequenceName = "ADDRESS_SEQ")
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;
}