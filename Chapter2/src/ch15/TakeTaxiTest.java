package ch15;

//��ü���� ���α׷���
public class TakeTaxiTest {

	public static void main(String[] args) {
		Customer customerE = new Customer("Edward" , 20000);
		Taxi taxi = new Taxi("�� ������ ���");
		
		customerE.takeTaxi(taxi);
		customerE.showInfo();
		taxi.showTaxiInfo();
	}

}
