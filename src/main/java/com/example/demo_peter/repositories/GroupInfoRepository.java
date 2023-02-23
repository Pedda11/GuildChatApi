package com.example.demo_peter.repositories;

import com.example.demo_peter.entities.GroupInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupInfoRepository extends JpaRepository<GroupInfo, Integer> {
}
