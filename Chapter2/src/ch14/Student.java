package ch14;

public class Student {
	
	public String name;
	public int money;
	
	public Student (String name , int money) {
		this.name=name;
		this.money = money;
		
	}
	public void takeBus(Bus bus) {
		bus.takeBus(1000);
		this.money -= 1000;
		
	}
	public void takeSubway(Subway subway) {
		subway.takeSubway(1200);
		this.money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(name + "의 남은 돈은 " + money +"원 입니다.");
	}

}
