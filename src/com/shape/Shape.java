package com.shape;

public interface Shape {

	default void rotateShape() {
		System.out.println("Rotate the Shape");
	}
	
}
