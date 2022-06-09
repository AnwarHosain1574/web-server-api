package com.example.bkash.test.service;

import com.example.bkash.test.model.UserInformation;
import com.example.bkash.test.repository.UserInformationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 2.0.0
 * @Since 6/8/2022
 * @Author Anwar Hosain - 600
 */

@Service
@AllArgsConstructor
public class UserInformationServiceImp implements UserInformationService {

    private UserInformationRepository repository;

    @Override
    public UserInformation save(UserInformation entity) {
        return repository.save(entity);
    }

    @Override
    public UserInformation update(UserInformation entity) {
        return repository.save(entity);
    }

    @Override
    public UserInformation delete(UserInformation entity) {
        repository.delete(entity);
        return entity;
    }

    @Override
    public UserInformation getById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public List<UserInformation> getAll() {
//        System.out.println(repository.findAll().size());
//        System.out.println(repository.findAll().toString());
        return repository.findAll();
    }
}
