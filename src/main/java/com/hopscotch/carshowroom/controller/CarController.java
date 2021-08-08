package com.hopscotch.carshowroom.controller;

import com.hopscotch.carshowroom.domain.Car;
import com.hopscotch.carshowroom.service.CarService;
import com.hopscotch.carshowroom.service.CarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1/car/")
@RestController
public class CarController {
    CarServiceImpl carService;

    @Autowired
    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }
    @GetMapping("carDetails")
    public ResponseEntity<?> getCarDetails()
    {
        Car carDetails=carService.getCarDetails();
        ResponseEntity responseEntity=new ResponseEntity<Car>(carDetails, HttpStatus.OK);
        System.out.println(carDetails);
        return responseEntity;
    }
}
