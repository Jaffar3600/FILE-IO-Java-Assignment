package com.myclass;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class MyClassTest {
	private MyClass myclass1,myclass2,myclass3,myclass4,myclass5;
	
	@Before
	public void setUp(){
		myclass1 = new MyClass();
		myclass2 = new MyClass();
		myclass3 = new MyClass();
		myclass4 = new MyClass();
		myclass5 = new MyClass();
		ArrayList<MyClass> list = new ArrayList<MyClass>();
		list.add(myclass1);
		list.add(myclass2);
		list.add(myclass3);
		list.add(myclass4);
		list.add(myclass5);
	}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
