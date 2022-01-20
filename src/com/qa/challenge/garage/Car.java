package com.qa.challenge.garage;

public class Car extends Vehicle {
	
	public Car(int maxSpeed, String colour, String colour1, char fuelType, String maxSpeed1) {
		super(maxSpeed, colour, colour, fuelType, maxSpeed);
		spotsNeeded = 2;
		size = VehicleSize.Medium;
	}
	
	public boolean canFitinGarage(GarageSpot spot) {
		return false;

}

	@Override
	public boolean canFitinSpot(GarageSpot spot) {
		return false;
	}
}