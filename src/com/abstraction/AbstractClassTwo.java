package com.abstraction;

public abstract class AbstractClassTwo extends AbstractClassOne {
	//If a abstract class extends another abstract class, it don't need to implement parent's method
	
	public abstract void bike();
	//Abstract method can never be final or private
	public void ride() {
		
	}

}
