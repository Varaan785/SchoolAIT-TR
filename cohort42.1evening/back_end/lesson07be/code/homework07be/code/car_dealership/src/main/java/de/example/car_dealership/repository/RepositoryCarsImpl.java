package de.example.car_dealership.repository;

import de.example.car_dealership.entity.Car;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class RepositoryCarsImpl implements RepositoryCar{

    private List<Car> list = List.of(
            new Car("Nissan","X-Trail",2014),
            new Car("BMW","M5 E36",2003),
            new Car("BMW","M3 E36",2000),
            new Car("Ford","Focus",2016),
            new Car("Ford","Mondeo",2024),
            new Car("Nissan","Skyline R34 GT-R",2003)

    );
    @Override
    public List<Car> findAllCars() {
        return List.of();
    }
}
