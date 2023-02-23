package com.example.demo_peter.services;


import com.example.demo_peter.entities.GroupInfo;
import com.example.demo_peter.repositories.GroupInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Collections.EMPTY_LIST;

@Service
public class GroupInfoService {

    @Autowired
    private GroupInfoRepository groupInfoRepository;

    public List<GroupInfo> getAll() {
        try{
            return groupInfoRepository.findAll();
        }catch (Exception ex){
            System.out.print("Error" + ex);
            return (List<GroupInfo>) EMPTY_LIST;
        }
    }
}
