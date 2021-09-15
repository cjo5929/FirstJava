package ch02;
// equal메서드 , clone메서드
public class EqualTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student Lee = new Student(100, "Lee");
		Student Lee2 = Lee;
		Student Shun = new Student(100, "Lee");
		
		System.out.println(Lee == Shun);
		System.out.println(Lee.equals(Shun));
		
		System.out.println(Lee.hashCode());
		System.out.println(Shun.hashCode());
		
		Student copyStudent = (Student)Shun.clone();
		System.out.println(copyStudent.hashCode());
	}

}
