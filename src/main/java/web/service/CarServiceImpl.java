package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{
    List<Car> carList;

    {
        carList = new ArrayList<>();
        Car car1 = new Car("car1", 1, "a1a1a1");
        Car car2 = new Car("car2", 2, "a2a1a1");
        Car car3 = new Car("car3", 3, "a3a1a1");
        Car car4 = new Car("car4", 4, "a4a1a1");
        Car car5 = new Car("car5", 5, "a5a1a1");
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
    }

    @Override
    public List<Car> filterCars(int i) {
        return carList.stream().limit(i).toList();
    }
}
