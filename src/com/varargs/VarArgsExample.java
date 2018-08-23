package com.varargs;

public class VarArgsExample {

	public static void main(String[] args) {
		VarArgsExample varArgs=new VarArgsExample();
		int areaDefault=2;
		System.out.println(varArgs.area(areaDefault,2,5,6));

	}
	
	public int area(int areaDefault, int ... b) {//varargs always be a last parameter
		int area=areaDefault;
		for(int a:b) {
		area=area*a;
		}
		return area;
	}

}
