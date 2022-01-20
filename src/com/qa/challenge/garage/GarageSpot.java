package com.qa.challenge.garage;

public class GarageSpot {

	private Vehicle vehicle;
	private int garageSpaceCount = 0;
	public GarageSpot(VehicleSize s) {
	}
	public boolean isAvailable() {
		return vehicle == null;
	}
	public boolean canFitVehicle(Vehicle vehicle) {
		return false;
	}
	public boolean park(Vehicle v) {
		return false;
	}
	public int getgarageSpaceCount() {
		return garageSpaceCount;
	}
	public void removeVehicle() {
	}
	
}
