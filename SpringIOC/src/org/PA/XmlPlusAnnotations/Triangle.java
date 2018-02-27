package org.PA.XmlPlusAnnotations;

import org.springframework.stereotype.Component;

@Component ("triangle")
public class Triangle implements Shape{

	@Override
	public void draw() {

		System.out.println("Drawn triangle");
	}

}
