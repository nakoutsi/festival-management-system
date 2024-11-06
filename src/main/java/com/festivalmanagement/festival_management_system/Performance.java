package com.festivalmanagement.festival_management_system;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "performances")
public class Performance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long performanceId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private int duration;

    @Column(columnDefinition = "TEXT")
    private String technicalRequirements;

    @ManyToOne
    @JoinColumn(name = "festival_id")
    private Festival festival;

    // Additional fields, constructors, getters, and setters
}
