package employee;

public class EmployeeDetails {
	public int empid,empSalary;
	String empName,empLocation;

	public EmployeeDetails(int empid, int empSalary, String empName, String empLocation) {
		super();
		this.empid = empid;
		this.empSalary = empSalary;
		this.empName = empName;
		this.empLocation = empLocation;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
