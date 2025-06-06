package com.example.PlacementProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.PlacementProject.entity.Placement;

@Repository
public interface PlacementRepo extends JpaRepository<Placement, Long> {
    // All basic CRUD operations are inherited from JpaRepository
}

