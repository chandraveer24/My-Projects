package org.PA.Shape;

public class ShapeCreator {

	private Shape shape;

	public void setShape(Shape shape) {
		this.shape = shape;
	}
	
	public void display()
	{
		shape.draw();
	}
	
}
