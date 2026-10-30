package vehicles;

public class Truck implements vehicleFuel {

	@Override
	public void calculateFuelConsumption(double fuel, double mileage) {
		mileage /= 5;
		fuel -= mileage;
		System.out.println(fuel);
		
	}

}
