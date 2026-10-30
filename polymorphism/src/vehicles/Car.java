package vehicles;

public class Car implements vehicleFuel {

	@Override
	public void calculateFuelConsumption(double fuel, double mileage) {
		mileage /= 10;
		fuel -= mileage;
		System.out.println(fuel);
	}

}
