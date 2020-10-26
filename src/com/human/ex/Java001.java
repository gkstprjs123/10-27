package com.human.ex;

import com.human.dto.Car;


public class Java001 {

	public static void main(String[] args) {
		Car car=new Car();
	    car.color="빨강";
	    car.company="현대";
	    car.maxSpeed=200;
	    car.model="소나타";
	    car.tire.companey="금호 타이어";
	    car.tire.mileage=20;
	    car.tire.price=50000;
	    
	    Car newCar= new Car();
	    newCar.color=car.color;
	    newCar.company=car.company;
	    newCar.maxSpeed=car.maxSpeed;
	    newCar.model=car.model;
	    newCar.tire.companey=car.tire.companey;
	    newCar.tire.mileage=car.tire.mileage;
	    newCar.tire.price=car.tire.price;
	    
	    
	    
	}

}
