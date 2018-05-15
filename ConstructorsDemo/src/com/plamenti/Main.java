package com.plamenti;

public class Main {

    public static void main(String[] args) {
	    Car plamenCar = new Car();

	    plamenCar.moveLeft();

		Car naskoCar = new Car("Green", "Reno");

		naskoCar.moveForward();

		Car dariCar = new Car("Red", "Opel", 2);

		dariCar.moveRight();

		Car tanyaCar = new Car("Red", "Suzuki", 2, "Swift");

		tanyaCar.moveRight();
    }
}
