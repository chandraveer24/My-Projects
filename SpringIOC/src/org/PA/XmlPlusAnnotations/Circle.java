package org.PA.XmlPlusAnnotations;

import org.springframework.stereotype.Component;

@Component ("circle")
public class Circle implements Shape{

	@Override
	public void draw() {

		System.out.println("Drawn Circle");
	}

}
