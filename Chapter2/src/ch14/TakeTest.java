package ch14;

//��ü���� ���α׷���

public class TakeTest {

	public static void main(String[] args) {
		Student studentJ = new Student("James",5000);
		Student studentT = new Student("Tom",10000);
		
		Bus bus = new Bus(100);
		Subway subway = new Subway(2);
		
		studentJ.takeBus(bus);
		studentT.takeSubway(subway);
		
		studentJ.showInfo();
		studentT.showInfo();
		bus.showBusInfo();
		subway.showSubwayInfo();

		
	}

}
