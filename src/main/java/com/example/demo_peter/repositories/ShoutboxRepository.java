package com.example.demo_peter.repositories;

import com.example.demo_peter.entities.ShoutBoxEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoutboxRepository extends JpaRepository<ShoutBoxEntry, Integer> {
}
