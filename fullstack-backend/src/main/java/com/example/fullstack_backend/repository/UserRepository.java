package com.example.fullstack_backend.repository;

import com.example.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//In the repository (DAO) we need to indicate the table name and the ID data type (User, Long)

public interface UserRepository extends JpaRepository<User,Long> {
}
