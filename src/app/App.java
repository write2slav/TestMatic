package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import factory.ShapeFactory;
import shapes.Shape;

public class App {

	public static void main(String[] args) {

		printShapesFromList(generateListOfRandomShapes());

	}

	public static List<Shape> generateListOfRandomShapes() {
		
		List<Shape> listOfShapes = new ArrayList<>();
		ShapeFactory shapeFactory = new ShapeFactory();

		// Random number of shapes created. Range 0-30
		int numberOfShapes = new Random().nextInt(30);

		for (int x = 0; x < numberOfShapes; x++) {

			// Random number. Range 0-3
			int shapeId = new Random().nextInt(3);

			listOfShapes.add(shapeFactory.getShape(shapeId));

		}
		return listOfShapes;
	}

	public static void printShapesFromList(List<Shape> shapes) {
		for (Shape shape : shapes) {
			shape.printShapeInfo();
		}
	}

}
