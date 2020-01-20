package shape;

public class Shapes {
		int shapeId;
		String shapName;
		public Shapes(int shapeId, String shapName) {
			super();
			this.shapeId = shapeId;
			this.shapName = shapName;
		}
		public int getShapeId() {
			return shapeId;
		}
		public void setShapeId(int shapeId) {
			this.shapeId = shapeId;
		}
		public String getShapName() {
			return shapName;
		}
		public void setShapName(String shapName) {
			this.shapName = shapName;
		}
		public void Display(String name )
		{
			name=shapName;
			System.out.println(name);
		}
		}


