package kz.keremet.model.dao;

import kz.keremet.model.dto.Car;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by HP on 01.09.2016.
 */
@Repository
public class CarDao {

    private static Map<Integer, Car> cars;

    static {
        cars = new HashMap<Integer, Car>(){
            {
                put(1, new Car(1,"blue", "tesla"));
            }
        };
    }
    public Collection<Car> getAllCar(){
        return this.cars.values();
    }
}
