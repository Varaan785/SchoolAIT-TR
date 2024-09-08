package de.example.car_dealership.service;

import de.example.car_dealership.entity.Car;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServiceCarImpl implements ServiceCars{
    @Override
    public List<Car> getAllCars() {
        return List.of();
    }
}
