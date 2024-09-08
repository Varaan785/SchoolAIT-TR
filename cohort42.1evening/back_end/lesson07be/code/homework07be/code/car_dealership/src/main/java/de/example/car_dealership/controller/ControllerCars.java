package de.example.car_dealership.controller;

import de.example.car_dealership.entity.Car;
import de.example.car_dealership.service.ServiceCars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerCars {
    private ServiceCars serviceCars;


    @Autowired
    public ControllerCars(ServiceCars serviceCars) {
        this.serviceCars = serviceCars;
    }

    @GetMapping("/cars")
    public List<Car> getCars() {
        return serviceCars.getAllCars();

    }


}
