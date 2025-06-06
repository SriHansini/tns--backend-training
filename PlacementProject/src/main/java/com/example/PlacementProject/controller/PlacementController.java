package com.example.PlacementProject.controller;
import com.example.PlacementProject.entity.Placement;
import com.example.PlacementProject.service.PlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/placements")
@CrossOrigin(origins = "*") // allows calls from Postman/browser
public class PlacementController {

    @Autowired
    private PlacementService service;

    // GET all placements
    @GetMapping
    public List<Placement> getAllPlacements() {
        return service.getAllPlacements();
    }

    // GET placement by ID
    @GetMapping("/{id}")
    public Optional<Placement> getPlacementById(@PathVariable Long id) {
        return service.getPlacementById(id);
    }

    // POST new placement
    @PostMapping
    public Placement createPlacement(@RequestBody Placement placement) {
        return service.createPlacement(placement);
    }

    // PUT update placement 
    @PutMapping("/{id}")
    public  Placement updatePlacement(@PathVariable Long id, @RequestBody Placement placement) {
        return service.updatePlacement(id, placement);
    }

    // DELETE placement
    @DeleteMapping("/{id}")
    public void deletePlacement(@PathVariable Long id) {
        service.deletePlacement(id);
    }
}

