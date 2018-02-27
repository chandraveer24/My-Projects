package org.PA.JavaBasedConfiguration;

//import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan (basePackages=("org.PA.JavaBasedConfigurtion"))
//For the author we have used @component annotation so we must specify @component scan to create
//a spring managed bean or mark that class as a bean class
@PropertySources ({@PropertySource("app.properties"), @PropertySource("connection.properties")})
public class ApplicationConfiguration {


	@Autowired
	private Environment env;
	
	
	@Bean
	public Circle getCircle() {
		return new Circle();
	}

	@Bean
	public Triangle getTriangle() {
		return new Triangle();
	}

	@Bean
	public ShapeCreator getShapeCreator() {
		System.out.println(env.getProperty("appName"));
		return new ShapeCreator(getTriangle());
	}
}
