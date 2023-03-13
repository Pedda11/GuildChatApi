package com.example.demo_peter.repositories;

import com.example.demo_peter.entities.EventItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventItemRepository extends JpaRepository<EventItem, Integer> {
}
