package ch14;

public class Bus {
	
	public int busNum;
	public int passengerCount;
	public int money;
	
	public Bus(int busNum) {
		this.busNum = busNum;
	}
	
	public void takeBus(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showBusInfo() {
		System.out.println(busNum + "�� ������ �°���"+ passengerCount +" �� �̰� ������"+ money + "�� �Դϴ�.");
	}

}
