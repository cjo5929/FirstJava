package school;

import java.util.ArrayList;

public class Student {
	
	private int studentId; //학번
	private String studentName; //이름
	private Subject major; //전공
	
	private ArrayList<Score> scoreList =new ArrayList<>();
	
	public Student(int studentId, String studentName, Subject major) {
		this.studentId =studentId;
		this.studentName = studentName;
		this.major = major;

	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Subject getMajor() {
		return major;
	}

	public void setMajor(Subject major) {
		this.major = major;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}

	public void addSubjectScore(Score score) {
		
		scoreList.add(score);
	}
	
	

}
