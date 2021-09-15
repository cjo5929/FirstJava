package ch24;

public class StudentTest {
	
	//ArrayList 를 활용한 간단한 성적 산출 프로그램
	public static void main(String[] args) {
		

		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		
		studentLee.showScoreInfo();
		System.out.println("======================================");
		studentKim.showScoreInfo();
	}

		
		
		
	}
	
	
	


