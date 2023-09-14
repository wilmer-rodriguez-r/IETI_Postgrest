package com.example.postgresql.data.repository;

import com.example.postgresql.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
