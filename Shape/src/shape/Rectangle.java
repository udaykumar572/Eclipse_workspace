package shape;

public class Rectangle extends Shapes{
	int lentgh,width;

	public Rectangle(int shapeId, String shapName, int lentgh, int width) {
		super(shapeId, shapName);
		this.lentgh = lentgh;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [lentgh=" + lentgh + ", width=" + width + ", shapeId=" + shapeId + ", shapName=" + shapName
				+ ", getLentgh()=" + getLentgh() + ", getWidth()=" + getWidth() + ", getShapeId()=" + getShapeId()
				+ ", getShapName()=" + getShapName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	public int getLentgh() {
		return lentgh;
	}

	public void setLentgh(int lentgh) {
		this.lentgh = lentgh;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public void Area()
	{
			System.out.println("Area of Rectangle is : "+lentgh*width);
	}
	
}
