package com.PA.Reflection;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;

public class Constructors {

	public int a;
	public int b;
	
	public Constructors() throws IndexOutOfBoundsException {
	}

	public Constructors(int a, int b)throws SQLException, IOException, FileAlreadyExistsException {
		super();
		this.a = a;
		this.b = b;
	}
	
	
}
