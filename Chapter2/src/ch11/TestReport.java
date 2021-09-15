package ch11;

public class TestReport {

	public static void main(String[] args) {
			MakeReport makereport= new MakeReport();
			String report = makereport.getReport();
			System.out.println(report);
	}

}
