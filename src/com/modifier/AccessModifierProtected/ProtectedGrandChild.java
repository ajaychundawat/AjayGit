package com.modifier.AccessModifierProtected;

public class ProtectedGrandChild extends ProtectedChild {
	public static void main(String[] args) {
		ProtectedChild cObj=new ProtectedChild();
		cObj.testIt();
	}
	public void testIt() {
		System.out.println(area()); // ProtectedGrandChild can access method of Parent class
									//because ProtectedChild inherits Parent class.
	}
}
