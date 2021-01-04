package org.acme.geometry;

public class Coordinate {
	private double x;
	private double y;
	
	public Coordinate() {
		this.x = Double.NaN;
		this.y = Double.NaN;
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
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public Boolean isEmpty() {
		if (Double.isNaN(this.x) && Double.isNaN(this.y)) {
			return true;
		}
		return false;	
	}
	

}
