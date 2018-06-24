package com.gr00shik.SpringBootLinkedInReservation.dao.repository;

import com.gr00shik.SpringBootLinkedInReservation.dao.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByFname(String Fname);

}
