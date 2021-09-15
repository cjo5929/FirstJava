package ch16;

public class Employee {
	
	private static int serialNum= 1000;
	
	private int EmployeeId;
	private String EmployeeName;
	private String department;
	
	public Employee() {
		serialNum++;
		EmployeeId = serialNum;
	}
	
	
	public static int getSerialNum() {
		return serialNum;
	}


	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
