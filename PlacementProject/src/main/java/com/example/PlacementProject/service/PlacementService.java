package com.example.PlacementProject.service;
import com.example.PlacementProject.repository.PlacementRepo;
import com.example.PlacementProject.entity.Placement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.PlacementProject.entity.Placement;

import java.util.List;
import java.util.Optional;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepo repo;

    // Get all placement records
    public List<Placement> getAllPlacements() {
        return repo.findAll();
    }

    // Get placement by ID
    public Optional<Placement> getPlacementById(Long id) {
        return repo.findById(id);
    }

    // Save new placement
    public Placement createPlacement(Placement placement) {
        return repo.save(placement);
    }
    public Placement updatePlacement(Long id, Placement placement) {
        Placement existingPlacement = repo.findById(id).orElseThrow(() -> new RuntimeException("Placement not found with id: " + id));

        // Update fields
        existingPlacement.setName(placement.getName());
        existingPlacement.setCollege(placement.getCollege());
        existingPlacement.setDate(placement.getDate());
        existingPlacement.setQualification(placement.getQualification());
        existingPlacement.setYear(placement.getYear());

        return repo.save(existingPlacement);
    }

    // Delete a placement
    public void deletePlacement(Long id) {
        repo.deleteById(id);
    }
}


