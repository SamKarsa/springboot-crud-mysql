package com.samkarsa.crud.dto.request;

import com.samkarsa.crud.model.Car;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CarRequestDTO {
    @NotBlank(message = "Model is required")
    @Size(
            min=1,
            max = 50,
            message = "Model must be between 1 and 50 characters")
    @Pattern(
            regexp = "^[a-zA-Z0-9áéíóúÁÉÍÓÚüÜñÑ\\s-]+$",
            message = "Model can only contain letters, numbers, spaces and hyphens")
    private String model;

    @NotBlank(message = "Description car is required")
    @Size(
            min=1,
            max = 100,
            message = "Description must be between 1 and 50 characters")
    @Pattern(
            regexp = "^[a-zA-Z0-9áéíóúÁÉÍÓÚüÜñÑ\\s-]+$",
            message = "Description can only contain letters, numbers, spaces and hyphens")
    private String description;


    @NotNull(message = "Price is required")
    @Positive(message = "Price must be a positive number")
    private Double price;

    @NotNull(message = "Year is required")
    @Min(
            value = 1900,
            message = "The year must not be earlier than 1900")
    @Max(
            value = 2025,
            message = "The year must not be greater than 2025")
    private Integer year;

    @NotNull(message = "Mileage is required")
    @Positive(message = "The mileage must be a positive number")
    private Integer mileage;

    @NotBlank(message = "CarStatus is required")
    private Car.CarStatus carStatus;

    @NotNull(message = "BrandId is required")
    @Positive(message = "BrandId must be a positive number")
    private Integer brandId;
}
