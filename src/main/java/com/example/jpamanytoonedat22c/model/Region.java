package com.example.jpamanytoonedat22c.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Region {

    @Id
    private String kode;
    private String navn;
    private String href;

}
