package rent1;

public enum CityDistances {
	Pune(0), Mumbai(2000), Bangalore(1000), Delhi(2050), chennai(1234);
	int distance;

	private CityDistances(int distance) {
		this.distance = distance;
	}

	int getDistance() {
		return distance;
	}
}