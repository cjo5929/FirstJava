package ch14;

public class Subway {
	
	public int subwayNum;
	public int passengerCount;
	public int money;
	
	public Subway(int subwayNum) {
		this.subwayNum = subwayNum;
	}
	
	public void takeSubway(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showSubwayInfo() {
		System.out.println(subwayNum + "�� ����ö�� �°���"+ passengerCount +" �� �̰� ������"+ money + "�� �Դϴ�.");
	}

}
