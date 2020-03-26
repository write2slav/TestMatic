package shapes;

public class Circle extends Shape {

	private double radius = 1;

	public Circle() {

		this.name = "Circle";

	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
		this.name = "Circle";
	}

	@Override
	public void draw() {
		System.out.print("Circle is drown");

	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;

	}

	@Override
	public void printShapeInfo() {
		System.out.print("Shape: " + this.getName() + ", ");
		System.out.print("area: " + this.getArea() + ", ");
		System.out.print("radius: " + this.getRadius() + ", ");
		System.out.print("color: " + this.getColor());
		System.out.println();
		
	}

}
