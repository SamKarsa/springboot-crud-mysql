package com.samkarsa.crud.dto.response;

import com.samkarsa.crud.model.Car;
import lombok.Data;

@Data
public class CarResponseDTO {
    private Integer carId;
    private String model;
    private String description;
    private Double price;
    private Integer year;
    private Integer mileage;
    private Car.CarStatus carStatus;
    private BrandResponseDTO brand;
}
