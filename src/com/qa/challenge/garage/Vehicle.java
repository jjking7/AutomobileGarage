package com.qa.challenge.garage;

import java.util.ArrayList;

public abstract class Vehicle {
	
	private ArrayList<GarageSpot> garageSpots =
            new ArrayList<GarageSpot>();
	protected int spotsNeeded;
	protected VehicleSize size;
	
	private String engineType;
	private String colour;
	private char fuelType;
	private int numOfDoors;
	
	public Vehicle(int maxSpeed, String engineType, String colour, char fuelType, int numOfDoors) {
		this.engineType = engineType;
		this.colour = colour;
		this.fuelType = fuelType;
		this.numOfDoors = numOfDoors;
		
	}
	
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public char getFuelType() {
		return fuelType;
	}
	public void setFuelType(char fuelType) {
		this.fuelType = fuelType;
	}
	public int getNumOfDoors() {
		return numOfDoors;
	}
	public void setNumOfDoors(int numOfDoors) {
		this.numOfDoors = numOfDoors;
	}
	
	public ArrayList<GarageSpot> getGarageSpots() {
		return garageSpots;
	}
	public void setGarageSpots(ArrayList<GarageSpot> garageSpots) {
		this.garageSpots = garageSpots;
	}
	public void setMaxSpeed(int maxSpeed) {
	}
	public void setSpotsNeeded(int spotsNeeded) {
		this.spotsNeeded = spotsNeeded;
	}
	public void setSize(VehicleSize size) {
		this.size = size;
	}
	
	public void drive() {
		System.out.println("Vroom vroom");
	}
	
	
	
	public int getSpotsNeeded()
    {
        return spotsNeeded;
    }
    public VehicleSize getSize()
    {
        return size;
    }
    
    public void garageSpot(GarageSpot s)
    {
        garageSpots.add(s);
    }
    
    public void clearSpots() {
    }
    public abstract boolean canFitinSpot(GarageSpot spot);
}
		
