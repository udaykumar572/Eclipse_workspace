
public class Exc {
	public static void main(String ar[])
	{
		int a=5;
		int b=0;
		try{
			System.out.println(a/b);
			}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Finally executed");
		}
		
		System.out.println("Exception Handling Example");
	}

}
