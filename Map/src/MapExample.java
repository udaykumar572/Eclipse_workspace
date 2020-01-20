import java.util.*;
public class MapExample {

	public static void main(String ar[])
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(01, "Balaji");
		m.put(02,"Anil");
		m.put(03,"cnil");
		m.remove(03);
		m.put(04,"dnil");
		for(Map.Entry ma:m.entrySet())
		{
			System.out.println(ma.getKey()+" "+ma.getValue());
		}
	}
}
	