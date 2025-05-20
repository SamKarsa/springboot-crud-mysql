package com.samkarsa.crud.service;

import com.samkarsa.crud.dto.response.CarResponseDTO;
import com.samkarsa.crud.mapper.CarMapper;
import com.samkarsa.crud.model.Car;
import com.samkarsa.crud.repository.CarRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public Page<CarResponseDTO> getAllCars(Pageable pageable) {
        Page<Car> cars = carRepository.findAll(pageable);
        if(cars.isEmpty()){
            return Page.empty();
        }
        return cars.map(carMapper::carToCarResponseDTO);
    }

}
