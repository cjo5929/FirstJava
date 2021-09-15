package school;

import java.util.ArrayList;

public class School {
		private static School instance= new School();
		
		
		private School() {};
		
		private ArrayList<Student> studentList =new ArrayList<>();
		private ArrayList<Subject> subjectList =new ArrayList<>();

		
		public static School getInstance() {
			if(instance == null) {
				instance = new School();
			}
			return instance;
		}


		public ArrayList<Student> getStudent() {
			return studentList;
		}


		public void setStudent(ArrayList<Student> student) {
			this.studentList = student;
		}


		public ArrayList<Subject> getSubject() {
			return subjectList;
		}


		public void setSubject(ArrayList<Subject> subject) {
			this.subjectList = subject;
		}
		
		public void addStudent(Student student) {
			studentList.add(student);
		}
		
		public void addSubject(Subject subject) {
			subjectList.add(subject);
		}
		

		
		
	
}
