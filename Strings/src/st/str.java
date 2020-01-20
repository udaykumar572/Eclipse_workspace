package st;
import java.util.*;
import java.util.Scanner;
public class str {
	
		public static void main(String ar[])
		{
			int count=0;
			System.out.println("Enter Strings to proceed \n");
			Scanner sc=new Scanner(System.in);
			String s1=sc.nextLine();
			String s2=sc.nextLine();
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			if(s1.length()!=s2.length())
			{
				System.out.println("Not Equal");
				System.exit(1);
			}
			for(int i=0;i<c1.length;i++)
			{
				if(c1[i]!=c2[i])
				{
					System.out.println("Not Equal");
					count++;
					break;
				}
			}
			if(count==0)
			{
				System.out.println("Equal");
			}
			
		}
}


