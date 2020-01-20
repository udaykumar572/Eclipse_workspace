package shape;

public class ShapeMain {
	public static void main(String ar[]) {
		Rectangle r=new Rectangle(1,"Rectangle",10,20);
		System.out.println(r);
		r.Area();
		Circle c=new Circle(2,"circle",5);
		System.out.println(c);
		c.Area();
		Square s=new Square(3,"square",5);
		System.out.println(s);
		s.Area();
				
	}

}
