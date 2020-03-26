package factory;

import shapes.*;

public class ShapeFactory {

	public Shape getShape(int shapeId) {

		if (shapeId == 0) {
			return new Circle();
		} else if (shapeId == 1) {
			return new Triangle();
		} else if (shapeId == 2) {
			return new Square();
		}

		return null;
	}

}
