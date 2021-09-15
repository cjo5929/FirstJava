package ch15;

//객체지향 프로그래밍
public class TakeTaxiTest {

	public static void main(String[] args) {
		Customer customerE = new Customer("Edward" , 20000);
		Taxi taxi = new Taxi("잘 나간다 운수");
		
		customerE.takeTaxi(taxi);
		customerE.showInfo();
		taxi.showTaxiInfo();
	}

}
