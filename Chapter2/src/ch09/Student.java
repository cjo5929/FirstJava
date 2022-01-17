package ch09;
// ���� �ڷ��� ����

public class Student {
	
	int studentId;
	String studentName;
	
	Subject math;
	Subject korea;
	String ZZ;
	Student(int studentId ,String studentName ){
		this.studentId = studentId;
		this.studentName = studentName;
		
		korea = new Subject();
		math = new Subject();
		
	}
	public void setKoreaSubject(String name , int score) {
		korea.score = score;
		korea.subjectName = name;
	}
	public void setMathSubject(String name, int score) {
		math.score =score;
		math.subjectName = name;
	}
	public void showScoreInfo() {
		int total = korea.score + math.score;
		System.out.println(studentName + "�л��� ������ " + total +" �Դϴ�.");
	}
	
	
	


}
