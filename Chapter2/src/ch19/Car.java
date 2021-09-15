package ch19;

public class Car {
	
	private static int carNum = 10000;
	
	private String carName;
	private int carId;
	
	public Car() {
		carNum++;
		carId= carNum;
	}
	
	public static int getCarNum() {
		return carNum;
	}

	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	
	
	

}
