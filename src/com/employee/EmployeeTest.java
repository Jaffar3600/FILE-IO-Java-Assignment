package com.employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	private Employee employee;
	
	@Before
	public void setUp(){
		employee = new Employee(1234,"jaffer",10000);
	}
	@Test
	public void testForWriteObject() {
		String str ="C:/Java_work/File.txt";
		employee.writeObject();
		
	}

}
