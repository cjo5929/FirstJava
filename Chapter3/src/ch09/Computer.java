package ch09;

public abstract class Computer {
	
	abstract void display();
	abstract void typing();
	
	public void turnOn() {
		System.out.println("��ǻ�� ������ �մϴ�.");
	}
	public void turnOff() {
		System.out.println("��ǻ�� ������ ���ϴ�.");
	}
	

}
