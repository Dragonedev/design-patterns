package vehicles;

public class Motorcycle implements vehicleFuel {

	@Override
	public void calculateFuelConsumption(double fuel, double mileage) {
		mileage /= 25;
		fuel -= mileage;
		System.out.println(fuel);
		
	}

}
