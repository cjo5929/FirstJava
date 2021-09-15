package ch10;

//추상클래스 템풀릭 메소드
public class CarTest {

	public static void main(String[] args) {
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println("=================");
		Car manualCar = new ManualCar();
		manualCar.run();

	}

}
