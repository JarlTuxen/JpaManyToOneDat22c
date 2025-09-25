package com.example.jpamanytoonedat22c.controller;

import com.example.jpamanytoonedat22c.model.Region;
import com.example.jpamanytoonedat22c.repository.RegionRepository;
import com.example.jpamanytoonedat22c.service.ApiServiceRegioner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class RegionRestController {

    @Autowired
    ApiServiceRegioner apiServiceRegioner;
    @Autowired
    private RegionRepository regionRepository;

    @GetMapping("/getregioner")
    List<Region> getRegioner(){

        return apiServiceRegioner.getRegioner();
    }

    @GetMapping("/region")
    List<Region> getRegion(){
        return regionRepository.findAll();
    }

    @PostMapping("/region")
    @ResponseStatus(HttpStatus.CREATED)
    public Region postRegion(@RequestBody Region region){
        System.out.println(region);
        return regionRepository.save(region);
    }

    @PostMapping("/region2")
    public ResponseEntity<String> postRegion2(@RequestParam String kode,
                                              @RequestParam String navn){
        return ResponseEntity.ok("Received: " + kode + " " + navn);
    }
}
