package com.samkarsa.crud.mapper;

import com.samkarsa.crud.dto.request.BrandRequestDTO;
import com.samkarsa.crud.dto.response.BrandResponseDTO;
import com.samkarsa.crud.model.Brand;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BrandMapper {

    // RequestDTO to entity
    @Mapping(target = "brandId", ignore = true)
    @Mapping(target = "cars", ignore = true)
    Brand toEntity(BrandRequestDTO brandRequestDTO);

    // Entity to ResponseDTO
    BrandResponseDTO brandToBrandResponseDTO(Brand brand);
}
