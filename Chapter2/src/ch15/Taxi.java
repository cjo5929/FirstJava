package ch15;

public class Taxi {
	
	public String name;
	public int money;
	
	public Taxi(String name) {
		this.name= name;
		
	}
	public void takeTaxi(int money) {
		this.money += money;
		
	}
	public void showTaxiInfo() {
		System.out.println(name+ "�ý� ������"+ money + "�� �Դϴ�.");
	}
	

}
