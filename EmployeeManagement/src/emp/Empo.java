package emp;
import java.util.*;
class Emp implements Comparable<Emp>{
		public int empId,EmpSal;
		public Emp(int empId)
		{
			this.empId=empId;
		}
		public int compareTo(Emp id)
		{
			return this.empId -id.empId;
		}
		
	}
public class Empo {
	public static void main(String ar[])
	{
		ArrayList<Emp> e1=new ArrayList<Emp>();
		e1.add(new Emp(242));
		e1.add(new Emp(01));
		e1.add(new Emp(12346));
		Collections.sort(e1);
		for(Emp e:e1) {
			System.out.println(e.empId);
		}
				
		
	}



}
