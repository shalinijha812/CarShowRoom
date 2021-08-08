package com.hopscotch.carshowroom;

import com.hopscotch.carshowroom.domain.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication
public class CarshowroomApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarshowroomApplication.class, args);
	}
}
