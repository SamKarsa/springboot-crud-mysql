package com.samkarsa.crud.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="CARS")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carId;

    @Column(nullable = false, length = 30)
    private String model;

    @Column(nullable = false, length = 100)
    private String description;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer year;

    @Column(nullable = false)
    private Integer mileage;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CarStatus carStatus;

    @ManyToOne
    @JoinColumn(name = "brandId", nullable = false)
    private Brand brand;

    public enum CarStatus {
        AVAILABLE,
        RESERVED,
        SOLD,
        MAINTENANCE,
        UNAVAILABLE
    }
}
