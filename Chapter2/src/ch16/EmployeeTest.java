package ch16;

//static 변수, 메서드 사용

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee = new  Employee();
		employee.setEmployeeName("홍길동");
		
		Employee employee1 = new  Employee();
		employee1.setEmployeeName("키키키");
		
		System.out.println(Employee.getSerialNum());
		
	
		
		System.out.println(employee.getEmployeeName() + "님의 사원번호는 "+ employee.getEmployeeId());
		System.out.println(employee1.getEmployeeName() + "님의 사원번호는 "+ employee1.getEmployeeId());
	}

}
