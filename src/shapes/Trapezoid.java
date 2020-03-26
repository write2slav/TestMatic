package shapes;

public class Trapezoid extends Shape {

	private double topBase = 1;
	private double bottomBase = 2;
	private double hight = 1;

	public Trapezoid() {

	}

	public Trapezoid(double topBase, double bottomBase, double hight, String color) {
		this.topBase = topBase;
		this.bottomBase = bottomBase;
		this.hight = hight;
		this.color = color;
		this.name = "Trapezoid";
	}

	@Override
	public void draw() {
		System.out.print("Trapezoid is drown");
	}

	@Override
	public double getArea() {
		return (topBase * bottomBase) / 2 * hight;
	}

	public double getHight() {
		return hight;
	}

	@Override
	public void printShapeInfo() {
		System.out.print("Shape: " + this.getName() + ", ");
		System.out.print("area: " + this.getArea() + ", ");
		System.out.print("side: " + this.getHight() + ", ");
		System.out.print("color: " + this.getColor());
		System.out.println();

	}
}
