package com.modifier.AccessModifierProtected;

import com.modifier.AccessModifier.Parent;

public class ProtectedChild extends Parent {

	public static void main(String[] args) {
		ProtectedChild cObj=new ProtectedChild();
		cObj.testIt();
	}
	public void testIt() {
		System.out.println(area());
	}
}
