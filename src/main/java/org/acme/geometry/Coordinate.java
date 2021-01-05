package org.acme.geometry;

public class Coordinate {
	private double x;
	private double y;
	
	public Coordinate() {

	}
	
	public Coordinate(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	
	public boolean isEmpty() {
		return Double.isNaN(x) || Double.isNaN(y);
	}
	

}
