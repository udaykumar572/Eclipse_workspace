
public class Constr {

	int carNum;
	int run()
	{
		return 60;
	}
}
	 class Ford extends Constr{
		int run()
		{
			return 100;
		}
	

public static void main(String ar[])
{
	Constr c=new Constr();
	c.run();
	
	Ford f=new Ford();
	f.run();

}
	}	
