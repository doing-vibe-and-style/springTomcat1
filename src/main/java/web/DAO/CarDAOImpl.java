package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO{
    @Override
    public List<Car> filterCars(List<Car> carList, int i) {
        return carList.stream().limit(i).toList();
    }
}
