package com.design;

public class Singleton {
	public static void main(String[] args) {
		EagerLoad obj1 = EagerLoad.getInstance();
		EagerLoad obj2 = EagerLoad.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
