package employee;

public class WageEmployee extends EmployeeDetails{
	int num,hours;

	public WageEmployee(int empid, int empSalary, String empName, String empLocation, int num, int hours) {
		super(empid, empSalary, empName, empLocation);
		this.num = num;
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "WageEmployee [num=" + num + ", hours=" + hours + ", empid=" + empid + ", empSalary=" + empSalary
				+ ", empName=" + empName + ", empLocation=" + empLocation + ", getNum()=" + getNum() + ", getHours()="
				+ getHours() + ", getEmpLocation()=" + getEmpLocation() + ", getEmpid()=" + getEmpid()
				+ ", getEmpSalary()=" + getEmpSalary() + ", getEmpName()=" + getEmpName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public void calculateSalary(int sal)
	{
			System.out.println(sal*10);
	}
	 
}
