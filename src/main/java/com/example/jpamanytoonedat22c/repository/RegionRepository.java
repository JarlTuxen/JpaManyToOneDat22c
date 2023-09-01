package com.example.jpamanytoonedat22c.repository;

import com.example.jpamanytoonedat22c.model.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, String> {
}
