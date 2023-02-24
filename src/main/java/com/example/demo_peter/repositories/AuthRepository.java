package com.example.demo_peter.repositories;

import com.example.demo_peter.entities.Auth;
import com.example.demo_peter.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Auth, Integer> {
}
