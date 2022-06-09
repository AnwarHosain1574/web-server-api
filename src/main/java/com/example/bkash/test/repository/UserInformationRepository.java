package com.example.bkash.test.repository;

import com.example.bkash.test.model.UserInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @version 2.0.0
 * @Since 6/8/2022
 * @Author Anwar Hosain - 600
 */

@Repository
public interface UserInformationRepository extends JpaRepository<UserInformation, Integer> {
}
