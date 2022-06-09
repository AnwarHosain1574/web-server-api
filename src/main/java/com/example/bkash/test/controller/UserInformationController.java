package com.example.bkash.test.controller;

import com.example.bkash.test.model.UserInformation;
import com.example.bkash.test.service.UserInformationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @version 2.0.0
 * @Since 6/8/2022
 * @Author Anwar Hosain - 600
 */

@RestController
@AllArgsConstructor
@RequestMapping("user-information")
public class UserInformationController {

    private UserInformationService service;

    @PostMapping
    UserInformation save(@RequestBody UserInformation entity) {
        return service.save(entity);
    }

    @PutMapping
    UserInformation update(@RequestBody UserInformation entity) {
        return service.update(entity);
    }

    @DeleteMapping
    UserInformation delete(@RequestBody UserInformation entity) {
        return service.delete(entity);
    }

    @GetMapping
    List<UserInformation> getAll() {
        return service.getAll();
    }

    @GetMapping("find-by-id/{id}")
    UserInformation findById(@PathVariable("id") Integer id) {
        return service.getById(id);
    }
}
