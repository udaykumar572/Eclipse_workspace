import java.util.*;
class Test extends Exception
{
	Test(String s)
	{
		super(s);
	}
}
public class Custom {
	static void validate(int age)throws Test{
		if(age<18)
			throw new Test("NOT VALID");
		else
			System.out.println("Welcome to vote ");
	}
	public static void main(String ar[])
	{
		try
		{
			validate(17);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured"+m);
		}
		System.out.println("Rest of the code");
		
	}
}
