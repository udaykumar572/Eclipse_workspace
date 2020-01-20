package vaa;
import java.util.*;
import java.util.stream.Stream;
 class EmpLambdas {
	 int id;
	 String name;
	 float salary;
	public EmpLambdas(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	 
}
	public class EmpLambda{
		public static void main(String ar[])
		{
		 
			List<EmpLambdas> emp=new ArrayList<EmpLambdas>();
			emp.add(new EmpLambdas(1,"S",17000f));  
	        emp.add(new EmpLambdas(3,"I",65000f));  
	        emp.add(new EmpLambdas(2,"So",25000f));  
	        emp.add(new EmpLambdas(4,"Nok",15000f));  
	        emp.add(new EmpLambdas(5,"Redm ",26000f));  
	        emp.add(new EmpLambdas(6,"LenVibe",19000f));
	        Stream<EmpLambdas> filtered_data=emp.stream().filter(p ->p.salary>20000);
	        filtered_data.forEach(emps ->System.out.println(emps.name+" "+emps.salary));
	        
	        
	    

	            
	        
		}
 }
 
	 
	 
