package ch16;

//static ����, �޼��� ���

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee = new  Employee();
		employee.setEmployeeName("ȫ�浿");
		
		Employee employee1 = new  Employee();
		employee1.setEmployeeName("ŰŰŰ");
		
		System.out.println(Employee.getSerialNum());
		
	
		
		System.out.println(employee.getEmployeeName() + "���� �����ȣ�� "+ employee.getEmployeeId());
		System.out.println(employee1.getEmployeeName() + "���� �����ȣ�� "+ employee1.getEmployeeId());
	}

}
