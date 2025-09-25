package com.example.jpamanytoonedat22c.controller;

import com.example.jpamanytoonedat22c.model.Kommune;
import com.example.jpamanytoonedat22c.repository.KommuneRepository;
import com.example.jpamanytoonedat22c.service.ApiServiceKommunerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class KommuneRestController {

    @Autowired
    ApiServiceKommunerImpl apiServiceKommunerImpl;
    @Autowired
    KommuneRepository kommuneRepository;

    @GetMapping("/getkommuner")
    List<Kommune> getKommuner(){
        return apiServiceKommunerImpl.getKommuner();
    }

    @GetMapping("/kommuner")
    List<Kommune> findAllKommuner(){
        return kommuneRepository.findAll();
    }

    @DeleteMapping("/kommuner/{kode}")
    public ResponseEntity<Void> deleteKommuneById(@PathVariable("kode") String kommuneKode) {
        Optional<Kommune> optionalKommune = kommuneRepository.findById(kommuneKode);
        if (optionalKommune.isPresent()) {
            kommuneRepository.deleteById(kommuneKode);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
