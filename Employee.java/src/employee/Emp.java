package employee;

public class Emp {
		public static void main(String ar[]) {
		WageEmployee w=new WageEmployee(1,20000,"Balaji","chennai",10,20);
		System.out.println(w); 
		w.calculateSalary(200);
		}

}
