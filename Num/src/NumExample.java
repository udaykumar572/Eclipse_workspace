import java.util.*;
public class NumExample {
	public static void main(String ar[])
	{
		 String n;
		 int total=0;
		 int count=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter a number");
	String num=s.nextLine();
	int size=num.length();
	int arr[]=new int[size];
	for(int i=0;i<arr[size];i++)
	{
		arr[i]=Integer.parseInt(num);
	}
	System.out.println(Arrays.toString(arr));
	 
	/*for(int i=0;i<arr.length;i++)
	{
		total=total+arr[i];
		
	}
	*/
	
	
	
	}
	
	
	
	

}
