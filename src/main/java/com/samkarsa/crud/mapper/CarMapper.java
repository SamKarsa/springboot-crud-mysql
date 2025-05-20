package com.samkarsa.crud.mapper;

import com.samkarsa.crud.dto.request.CarRequestDTO;
import com.samkarsa.crud.dto.response.CarResponseDTO;
import com.samkarsa.crud.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CarMapper {

    // RequestDTO to entity
    @Mapping(target = "carId", ignore = true)
    @Mapping(target = "brand", source = "brandId")
    Car toEntity(CarRequestDTO carRequestDTO);

    // Entity to ResponseDTO
    CarResponseDTO carToCarResponseDTO(Car car);
}
