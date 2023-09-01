package com.example.jpamanytoonedat22c.repository;

import com.example.jpamanytoonedat22c.model.Kommune;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KommuneRepository extends JpaRepository<Kommune, String> {
}
