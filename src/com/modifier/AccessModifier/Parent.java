package com.modifier.AccessModifier;

public class Parent {
	int x;
	protected int area() {
		x=20;
		return x;
	}
	
	int square() {
		return x=30;
	}
}
