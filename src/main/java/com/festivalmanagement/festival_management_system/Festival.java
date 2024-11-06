package com.festivalmanagement.festival_management_system;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "festivals")
public class Festival {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long festivalId;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(nullable = false)
    private Date dates;

    @Column(nullable = false)
    private String venue;

    @OneToMany(mappedBy = "festival", cascade = CascadeType.ALL)
    private List<Performance> performances;

    // Additional fields, constructors, getters, and setters
}
