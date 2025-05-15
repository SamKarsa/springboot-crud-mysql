package com.samkarsa.crud.dto.request;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class BrandRequestDTO {
    @NotBlank(message = "Brand name is required")
    @Size(
            min=2,
            max = 50,
            message = "Brand name must be between 2 and 50 characters")
    @Pattern(
            regexp = "^[a-zA-Z0-9áéíóúÁÉÍÓÚüÜñÑ\\s-]+$",
            message = "Brand name can only contain letters, numbers, spaces and hyphens")
    private String brandName;
}
