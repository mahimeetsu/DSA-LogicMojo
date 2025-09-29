package com.design;

public class LazyLoad {
	// private instance ,because it can be accessed by only getInstance method
	private static LazyLoad instance;

	private LazyLoad() {

	}

	// public method to return instance
	public static LazyLoad getInstance() {
		if (instance == null) {
			instance = new LazyLoad();
		}
		return instance;
	}

}
