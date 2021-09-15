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
		System.out.println(busNum + "번 버스의 승객은"+ passengerCount +" 명 이고 수익은"+ money + "원 입니다.");
	}

}
