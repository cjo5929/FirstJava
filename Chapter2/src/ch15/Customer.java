package ch15;

public class Customer {
	
	public String name;
	public int money;
	
	public Customer(String name, int money) {
		this.name =name;
		this.money = money;
		
	}
	public void takeTaxi(Taxi taxi) {
		taxi.takeTaxi(10000);
		this.money -=10000;
	
		
	}
	public void showInfo() {
		System.out.println(name +"���� ���� ����" + money + "�� �Դϴ�.");
	}

}
