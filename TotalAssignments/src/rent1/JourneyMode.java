package rent1;

public class JourneyMode {
	
	String vehicle, sourceAndDestination;

	public JourneyMode(String vehicle, String sourceAndDestination) {
		this.vehicle = vehicle;
		this.sourceAndDestination = sourceAndDestination;
		
		if (vehicle.contains("Bus") || (vehicle.contains("bus")) )
		{
			Bus.getRent(vehicle,sourceAndDestination);
		}
		
		if (vehicle.contains("Car") || (vehicle.contains("car")) )
		{
			Car.getRent(vehicle,sourceAndDestination);
		}
		
		if (vehicle.contains("SUV") || (vehicle.contains("XUV")) )
		{
			SUV.getRent(vehicle,sourceAndDestination);
		}
		
	}
	
	
	

}
