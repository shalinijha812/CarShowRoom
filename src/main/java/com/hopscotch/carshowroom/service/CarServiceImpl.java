package com.hopscotch.carshowroom.service;

import com.hopscotch.carshowroom.domain.Car;
import com.hopscotch.carshowroom.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Value("${carservice.service.franchiseinfo}")
    private String franchiseinfo;



    @Override
    public Car getCarDetails() {
        Car car=new Car(franchiseinfo,"car details");
        return car;
    }
}
