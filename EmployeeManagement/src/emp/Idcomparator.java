package emp;
import java.util.*;

	class Idcomparator implements Comparator{  
		public int compare(Object o1,Object o2)
		{
			Employye e1=(Employye)o1;
			Employye e2=(Employye)o2;
			if(e1.empId==e2.empId)
				return 0;
			else if(e1.empId>e2.empId)
				return 1;
			else
				return -1;
			
		}
	

}
