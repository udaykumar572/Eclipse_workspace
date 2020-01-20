package inte;
interface Floating
{
	int maxspeed=70;
	public void show();
}
public class Water extends Automobile implements Floating{
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
	}	public void show() {
		// TODO Auto-generated method stub
		System.out.println("The Auto mobile details are: \n"+"Model number:"+getModelnum()+"\n model name :"+getModelName());
		System.out.println("this Ship is flying with the speed of"+maxspeed+"kmph");

		
	}

}
