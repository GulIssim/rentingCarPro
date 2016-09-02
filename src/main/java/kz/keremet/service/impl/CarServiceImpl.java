package kz.keremet.service.impl;

import kz.keremet.model.entity.Car;
import kz.keremet.repository.CarRepository;
import kz.keremet.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HP on 02.09.2016.
 */
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarRepository carRepository;
    @Override
    public List<Car> getAllCars() {
        List<Car> cars = carRepository.findAll();
        return cars;

    }
}
