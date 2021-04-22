package com.wty.service.impl;

import com.wty.mapper.PetMapper;
import com.wty.pojo.Pet;
import com.wty.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetMapper pm;

    @Override
    public List<Pet> getall() {
        return pm.getall();
    }
}
