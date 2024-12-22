package com.microservices.user.service.UserService.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "SequenceSubCategoryId", sequenceName = "SUB_CATEGORY_SEQ")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", unique=true)
    private String email;

    @Column(name = "gender")
    private String gender;
}
