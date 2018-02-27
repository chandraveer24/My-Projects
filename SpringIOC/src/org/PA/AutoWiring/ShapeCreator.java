package org.PA.AutoWiring;

public class ShapeCreator {

	private Circle circle;

	 void display()
	{
		System.out.println(circle);
	}
	public ShapeCreator(){
		
	}
	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public ShapeCreator(Circle circle) {
		this.circle=circle;
	}
	
	
	
}
