package ch09;

public class SubjectTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1,"Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 50);
		
		studentLee.showScoreInfo();
		
	}

}
