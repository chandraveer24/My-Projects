package org.PA.XmlPlusAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//I am not using @Component annotation. Instead I am creating in xml file
public class ShapeCreator1 {

	@Autowired
	@Qualifier ("triangle")
	private Shape shape;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}



}
