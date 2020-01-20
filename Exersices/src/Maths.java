import java.math.*;
import java.util.Scanner;
public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 integer values and one double value");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double d=sc.nextFloat();
		System.out.println("Max of a and b is:"+Math.max(a, d));
		System.out.println("Min of a and b is:"+Math.min(a, b));
		System.out.println("Ciel of d is:"+Math.ceil(d));
		System.out.println("power of a and b is:"+Math.pow(d, b));
		System.out.println("floor of d is:"+Math.floor(d));
		System.out.println("Random number"+Math.random());
		System.out.println("Square root of d:"+Math.sqrt(d));
		System.out.println("Cube Root of d:"+Math.cbrt(d));		
		System.out.println("Sign of a  is:"+Math.signum(a));
		System.out.println("Addition a and b is:"+Math.addExact(a, b));


		

		







	}

}
