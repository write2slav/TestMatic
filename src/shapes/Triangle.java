package shapes;

public class Triangle extends Shape {

	private double hight = 1;
	private double base = 3;

	public Triangle() {
		this.name = "Triangle";
	}

	public Triangle(double hight, double base, String color) {
		this.hight = hight;
		this.base = base;
		this.color = color;
		this.name = "Triangle";
	}

	@Override
	public void draw() {
		System.out.print("Triangle is drown");

	}

	@Override
	public double getArea() {
		return (base * hight) / 2;
	}
	
	public double getHight() {
		return hight;
		
	}
	@Override
	public void printShapeInfo() {
		System.out.print("Shape: " + this.getName() + ", ");
		System.out.print("area: " + this.getArea() + ", ");
		System.out.print("hight: " + this.getHight() + ", ");
		System.out.print("color: " + this.getColor());
		System.out.println();
		
	}
}
