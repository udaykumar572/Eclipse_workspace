import java.math.*;
import java.util.*;
import java.util.Scanner;
public class Fourth {

	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of eggs: ");
		int a=sc.nextInt();
		int grosscount=0;
		int dozencount=0;
		if(a>143)
		{
			grosscount=a/144;
			System.out.println("gross count :"+grosscount);
		}
		a=a-144*grosscount;
		if(a>11&&a<144)
		{
			dozencount=a/12;
			System.out.println("Dozen cosunt :"+dozencount);
		}
		a=a-12*dozencount;
			System.out.println("individual units are:"+a);
		
	}
}   
