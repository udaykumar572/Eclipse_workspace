package vaa;

public class VarExamp {
	static void disp(int... values)
	{
		int sum=0;
		System.out.println("display method id invoked");
		for(int i:values)
		{
			sum=sum+i;
		}
		System.out.println("The sum of given numbers is :"+sum);
	}
	public static void main(String ar[])
	{
		disp();
		disp(1,2,3,4,5);
		disp(20,30);
		disp(50,40,20,30,5,5);
	}
}
