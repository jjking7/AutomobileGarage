package com.qa.challenge.garage;

public class Motorbike extends Vehicle {
	
	public Motorbike(int maxSpeed, String colour, String colour1, char fuelType, String maxSpeed1) {
		super(maxSpeed, colour, colour, fuelType, maxSpeed);
		spotsNeeded = 1;
		size = VehicleSize.Small;
	}
	
	public boolean canFitin(GarageSpot spot) {
		return false;

	}

	@Override
	public boolean canFitinSpot(GarageSpot spot) {
		return false;
	}
}