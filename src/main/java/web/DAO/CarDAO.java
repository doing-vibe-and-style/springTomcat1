package web.DAO;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    List<Car> filterCars(List<Car> carList, int i);
}
