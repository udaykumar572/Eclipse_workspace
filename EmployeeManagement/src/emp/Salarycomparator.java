package emp;

import java.util.*;

public class Salarycomparator implements Comparator{
	public int compare(Object o1,Object o2)
	{
		Employye e1=(Employye)o1;
		Employye e2=(Employye)o2;
		if(e1.empSalary==e2.empSalary)
			return 0;
		else if(e1.empSalary>e2.empSalary)
			return 1;
		else
			return -1;
  
	}


}
