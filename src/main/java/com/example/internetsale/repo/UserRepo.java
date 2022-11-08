package com.example.internetsale.repo;



import com.example.internetsale.model.Market;
import com.example.internetsale.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    List<User> findByFirstname(String firstname);

    User findUserById(Long id);
}
