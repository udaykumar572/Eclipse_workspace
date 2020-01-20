package emp;
import java.util.*;
public class MainComp {
	public static void main(String ar[])
{
		ArrayList al=new ArrayList();
		al.add(new Employye(01,"Balaji",20000));
		al.add(new Employye(20,"Anil",3000));
		al.add(new Employye(15,"Cnu",756));
		System.out.println("Sorting with Id");
		Collections.sort(al,new Idcomparator());
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Employye em=(Employye)itr.next();
			System.out.println(em.empId+" "+em.empName+" "+em.empSalary);
			
		}
		System.out.println("Sorting by Salary");
		Collections.sort(al,new Salarycomparator());
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			Employye emn=(Employye)it.next();
			System.out.println(emn.empId+" "+emn.empName+" "+emn.empSalary);
		}



}

}
