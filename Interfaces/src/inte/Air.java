package inte;
interface Flyy
{
	public void show();
}

public class Air extends Automobile implements Flyy{
	double speed=1000;
	
	public void show()
	{
		System.out.println("The Auto mobile details are: \n"+"Model number:"+getModelnum()+"\n model name :"+getModelName());
		System.out.println("this Aeroplane is flying with the speed of"+speed+"kmph");
		
	}
	public int getModelnum()
	{
		return modelnum;
	}
	public void setModelnum(int modelnum)
	{
		this.modelnum=modelnum;
	}

	
	public String getModelName()
	{
		return modelName;
	}
	public void setModelName(String modelName)
	{
		this.modelName=modelName;
	}
	
}
