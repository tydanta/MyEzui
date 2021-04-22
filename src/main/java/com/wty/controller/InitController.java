package com.wty.controller;

import com.wty.pojo.Pet;
import com.wty.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class InitController {

    @Autowired
    private PetService ps;

    @RequestMapping("/")
    public String getall()
    {
        List<Pet> list=ps.getall();
        for (Pet p : list) {
            System.out.println(p.getPetName());
        }
        return "index";
    }

}
