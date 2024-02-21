package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {


    public List<Car> carsCount (int count) {

        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Black", 2014, "Kia"));
        cars.add(new Car("Red", 2018, "Kia"));
        cars.add(new Car("Black", 2010, "Audi"));
        cars.add(new Car("Silver", 2014, "Porsche"));
        cars.add(new Car("White", 2020, "BMW"));

        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }

}
