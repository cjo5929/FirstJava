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
		System.out.println(name+ "택시 수입은"+ money + "원 입니다.");
	}
	

}
