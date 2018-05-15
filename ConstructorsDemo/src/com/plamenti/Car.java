package com.plamenti;

public class Car {
	private String color;
	private String brand;
	private int seats;
	private String model;

		public Car(){
		color = "Blue";
		brand = "BMW";
		seats = 4;
		model = "No model";
	}

	public Car(String colorAsParam, String brandAsParam){
		this.color = colorAsParam;
		this.brand = brandAsParam;
		seats = 4;
		model = "No model";
	}

	public Car(String colorAsParam, String brandAsParam, int seatsAsParam){
		this(colorAsParam, brandAsParam);
		seats = seatsAsParam;
		model = "No model";
	}

	public Car(String colorAsParam, String brandAsParam, int seatsAsParam, String modelAsParam){
		this(colorAsParam, brandAsParam, seatsAsParam);
		this.model = modelAsParam;
	}

	public void moveForward(){
		System.out.println(this.toString() + " is moving forward");
	}

	public void moveBackward(){
		System.out.println(this.toString() + " is moving backward");
	}

	public void moveLeft(){
		System.out.println(this.toString() + " is moving left");
	}

	public void moveRight(){
		System.out.println(this.toString() + " is moving right");
	}

	@Override
	public String toString() {
		return "Car of brand " + brand + " model " + model + " with color " + color + " with seats " + seats;
	}
}
