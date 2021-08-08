package com.hopscotch.carshowroom.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;


public class Car {
    @Value("${carservice.service.franchiseinfo}")
    String franchiseinfo;
    String cardetails;

    public Car(String franchiseinfo, String cardetails) {
        this.franchiseinfo = franchiseinfo;
        this.cardetails = cardetails;
    }

    public String getCardetails() {
        return cardetails;
    }

    public void setCardetails(String cardetails) {
        this.cardetails = cardetails;
    }
    public String getFranchiseinfo() {
        return franchiseinfo;
    }

    public void setFranchiseinfo(String franchiseinfo) {
        this.franchiseinfo = franchiseinfo;
    }
    @Override
    public String toString() {
        return "Car{" +
                "franchiseinfo='" + franchiseinfo + '\'' +
                ", cardetails='" + cardetails + '\'' +
                '}';
    }

}
