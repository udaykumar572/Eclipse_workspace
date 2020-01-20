package ha;

public class Engine {
	int enginenum,age;
	String fuel;
	public Engine(int enginenum, int age, String fuel) {
		super();
		this.enginenum = enginenum;
		this.age = age;
		this.fuel = fuel;
	}
	/*
	public int getEnginenum() {
		return enginenum;
	}
	public void setEnginenum(int enginenum) {
		this.enginenum = enginenum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	@Override
	public String toString() {
		return "Engine [enginenum=" + enginenum + ", age=" + age + ", fuel=" + fuel + ", getEnginenum()="
				+ getEnginenum() + ", getAge()=" + getAge() + ", getFuel()=" + getFuel() + "]";
	}*/
	@Override
	public String toString() {
		return "Engine [enginenum=" + enginenum + ", age=" + age + ", fuel=" + fuel + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
class Car
{
	int carno;
	String mode;
	Engine e;
	public Car(int carno, String mode, Engine e) {
		super();
		this.carno = carno;
		this.mode = mode;
		this.e = e;
	}
	/*@Override
	\public String toString() {
		return "Car [carno=" + carno + ", mode=" + mode + ", e=" + e + "]";
	}*/
	@Override
	public String toString() {
		return "Car [carno=" + carno + ", mode=" + mode + ", e=" + e + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}