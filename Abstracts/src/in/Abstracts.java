package in;
abstract class Abstraction{
	abstract void add(int a,int b);
	void show()
	{
		System.out.println("This is an Abstract class");
	}
}
class Extract extends Abstraction{
	 void add(int a,int b)
	{
		System.out.println(a+b); 
	}
}
public class Abstracts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Extract e =new Extract();
		e.add(20, 30);
	}

}
