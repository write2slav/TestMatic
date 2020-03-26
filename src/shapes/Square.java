package shapes;

public class Square extends Shape {

	private double side = 1;

	public Square() {
		this.name = "Squre";
	}

	public Square(double side, String color) {
		this.side = side;
		this.color = color;
		this.name = "Squre";
	}

	@Override
	public void draw() {
		System.out.print("Squre is drown");

	}

	@Override
	public double getArea() {
		return side * side;
	}
	
	public double getSide() {
		return side;

	}

	@Override
	public void printShapeInfo() {
		System.out.print("Shape: " + this.getName() + ", ");
		System.out.print("area: " + this.getArea() + ", ");
		System.out.print("side: " + this.getSide() + ", ");
		System.out.print("color: " + this.getColor());
		System.out.println();
		
	}

}
