package ch19;

//static , �̱��� ���� ���
public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getinstance();
		Car mysonata = factory.createCar();
		Car mysantafe = factory.createCar();
		
		System.out.println(mysonata.getCarId());
		System.out.println(mysantafe.getCarId());
		
		

	}

}
