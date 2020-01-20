package shape;

public class Square extends Shapes{
int side;

public Square(int shapeId, String shapName, int side) {
	super(shapeId, shapName);
	this.side = side;
}

public int getSide() {
	return side;
}

public void setSide(int side) {
	this.side = side;
}

@Override
	public String toString() {
					return "Square [side=" + side + ", shapeId=" + shapeId + ", shapName=" + shapName + "]";
							}
public void Area()
{
	System.out.println("The AREA OF SQUARE IS:"+side*side);
}


}
