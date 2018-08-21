package com.modifier.AccessModifier;

public class Child extends Parent{

	public static void main(String[] args) {
		Child cObj=new Child();
		cObj.testIt();
	}
	public void testIt() {
		System.out.println(square()); // This class can access square method as both classes are in same
		//package and square()'s modifier is default
	}
}
