package com.qa.challenge.garage;

public class Van extends Vehicle {
	
	public Van(int maxSpeed, String colour, String colour1, char fuelType, String maxSpeed1) {
		super(maxSpeed, colour, colour, fuelType, maxSpeed);
		spotsNeeded = 3;
		size = VehicleSize.Large;
	}
	
	public boolean canFitinGarage(GarageSpot spot) {
		return false;
	}

	@Override
	public boolean canFitinSpot(GarageSpot spot) {
		return false;
	}
}

	
