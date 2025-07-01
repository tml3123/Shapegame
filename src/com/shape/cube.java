package com.shape;

public class cube {
	double side;
	public cube() {
		
	}
	cube(double side){
		this.side=side;
		
	}
	public void getVolume() {
		System.out.println("volume of cube is:"+side*side*side+"cu. Unit");
	}
	public void getCurvedSurfaceArea() {
		System.out.println("curved surface area of cube is :"+4*side*side+"Sq. Unit");
	}
	public void getTotalSurfaceArea() {
		System.out.println("Total Surface Area of cube is:"+6*side*side+"Sq. Unit");
		}

}
