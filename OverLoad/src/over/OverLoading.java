package over;
 class Addition

 {
	 int add(int a,int b)
	 {
		 	return a+b;
		
	 }
	 double add(double a,int b)
	 {
		 	return a+b;
		
	 }
	 double add(double a,double b)
	 {
		 	return a+b;
		
	 }
	 
 }

public class OverLoading {
	public static void main(String ar[]) {
		Addition a=new Addition();
		System.out.println(a.add(20,30));
		System.out.println(a.add(20, 29.5));
		System.out.println(a.add(24.9,24.1));
		}
}
