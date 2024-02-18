package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCarList(ModelMap model, Integer count) {

        CarServiceImpl carService = new CarServiceImpl();

        List<Car> cars = carService.carsCount(count);

        model.addAttribute("cars", cars);

        return "cars";
    }

}
