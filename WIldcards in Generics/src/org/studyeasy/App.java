package org.studyeasy;

import java.util.ArrayList;
import java.util.List;

class Vehicle {
	private int vehicleId;

	public Vehicle(int vehicleId) {
		super();
		this.vehicleId = vehicleId;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	@Override
	public String toString() {
		return "Vehicle [VehicleId=" + vehicleId + "]";
	}
	
	public void info() {
		System.out.println("Vehicle ID is " + getVehicleId());
	}
	
	
}

class Car extends Vehicle {

	private String carModel;

	public Car(int vehicleId, String carModel) {
		super(vehicleId);
		this.carModel = carModel;
	}

	@Override
	public String toString() {
		return "Car [carModel=" + carModel + "]";
	}

	public String getCarModel() {
		return carModel;
	}
	
	public void info() {
		System.out.println("Car Model is " + getCarModel());
	}
	
	
	
}


public class App {

	public static void main(String[] args) {
		List<Vehicle> list = new ArrayList<>();
		list.add(new Vehicle(10));
		list.add(new Vehicle(11));
		list.add(new Vehicle(12));
		list.add(new Vehicle(13));
		list.add(new Car(14, "A14"));
		
		App app = new App();
		app.display(list);

	}
	
	
	//UPPERBOUND ----> (List<? extends Vehicle> list) list will accept value of Vehicle or child class of Vehicle 
	// in this, the object could be of type Vehicle OR Car (child)
	public static void display(List<? extends Vehicle> list) {
		for(Vehicle element : list) {
			element.info();
		}
	}
	//LOWERBOUND ----> Extends the CHILD class and super means it goes UP
	public static void display2(List<? super Car> list) {
		for(Object element : list) {
			System.out.println(element);
		}
	}
	

}
