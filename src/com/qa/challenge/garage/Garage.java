package com.qa.challenge.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Vehicle> garage = new ArrayList<Vehicle>();
	private int garageSize = 10;
	public int garageSize() { return garageSize(); }
	
	public void spotFreed() { garageSize++; }
			
	public void addVehicle(Vehicle vehicle) {
		if (garage.size() < garageSize)
			garage.add(vehicle);
		else
			System.out.println("No more available spots");
	}
	
	public void removeVehicle(Vehicle vehicle) {
		garage.remove(vehicle);
	}
	
	public void removeAllVehicles() {
		garage.clear();
	}
}
