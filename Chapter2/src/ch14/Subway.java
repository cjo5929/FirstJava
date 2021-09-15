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
		System.out.println(subwayNum + "번 지하철의 승객은"+ passengerCount +" 명 이고 수익은"+ money + "원 입니다.");
	}

}
