package com.example.bkash.test.service;

import com.example.bkash.test.model.UserInformation;

import java.util.List;

/**
 * @version 2.0.0
 * @Since 6/8/2022
 * @Author Anwar Hosain - 600
 */

public interface UserInformationService {
    UserInformation save(UserInformation entity);
    UserInformation update(UserInformation entity);
    UserInformation delete(UserInformation entity);
    UserInformation getById(Integer id);
    List<UserInformation> getAll();
}
