package shape;

public class Circle extends Shapes{
	 int r;

	public Circle(int shapeId, String shapName, int r) {
		super(shapeId, shapName);
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", shapeId=" + shapeId + ", shapName=" + shapName + "]";
	}
	 public void Area()
	 {
		 System.out.println("Area of Circle is"+r*r*3.14);
	 }
}
