package com.example.jpamanytoonedat22c.controller;

import com.example.jpamanytoonedat22c.model.Kommune;
import com.example.jpamanytoonedat22c.service.ApiServiceKommunerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class KommuneRestController {

    @Autowired
    ApiServiceKommunerImpl apiServiceKommunerImpl;

    @GetMapping("/getkommuner")
    List<Kommune> getKommuner(){
        return apiServiceKommunerImpl.getKommuner();
    }

    //@GetMapping("/kommuner")
}
