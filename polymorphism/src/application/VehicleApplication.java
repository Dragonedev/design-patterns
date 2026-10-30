package application;

import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Truck;
import vehicles.vehicleFuel;

public class VehicleApplication {

	public static void main(String[] args) {
		vehicleFuel v1 = new Car();
		vehicleFuel v2 = new Motorcycle();
		vehicleFuel v3 = new Truck();
		
		v1.calculateFuelConsumption(50, 200);
		v2.calculateFuelConsumption(50, 200);
		v3.calculateFuelConsumption(50, 200);
	}
}
