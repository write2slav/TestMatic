package shapes;

public abstract class Shape {

	protected String name = "Shape";
	protected String color = "Transparent";

	public String getName() {
		return name;
	};

	public String getColor() {
		return color;
	};

	public abstract double getArea();

	public abstract void draw();
	
	public abstract void printShapeInfo();

}
