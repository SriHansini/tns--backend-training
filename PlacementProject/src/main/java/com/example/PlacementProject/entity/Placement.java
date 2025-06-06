package com.example.PlacementProject.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "placements")
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String college;
    private LocalDate date;
    private String qualification;
    private int year;

    // Constructors
    public Placement() {}

    public Placement(Long id, String name, String college, LocalDate date, String qualification, int year) {
        this.id = id;
        this.name = name;
        this.college = college;
        this.date = date;
        this.qualification = qualification;
        this.year = year;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCollege() { return college; }
    public void setCollege(String college) { this.college = college; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getQualification() { return qualification; }
    public void setQualification(String qualification) { this.qualification = qualification; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }
}

