package com.example.bkash.test.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @version 2.0.0
 * @Since 6/8/2022
 * @Author Anwar Hosain - 600
 */

@Data
@Entity
@Table(name = "user_information")
public class UserInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;
}
