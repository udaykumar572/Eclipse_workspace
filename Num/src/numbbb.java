import java.util.*;
public class numbbb {
public static void main(String ar[])
{
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int temp=0,total=0,count=0;
	
	while(num>0)
	{
		temp=num%10;
		
		total=total+temp;
		num=num/10;
		count++;
	}
	
	
	System.out.println("The count of a num is"+count);
	 
}
}
