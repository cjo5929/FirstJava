package ch11;

//오류의 로그를 남기기 - java.util.logging.Logger 활용


public class StudentTest {

	public static void main(String[] args) {

		MyLogger myLogger = MyLogger.getLogger();

		String name = null;
		try {
			Student student = new Student(name);

		} catch (StudentNameFormatException e) {
			myLogger.warning(e.getMessage());
		}

		try {
			Student student = new Student("Edward Jon Kim Test");
		} catch (StudentNameFormatException e) {
			myLogger.warning(e.getMessage());
		}

		Student student = new Student("James");
	}

}
