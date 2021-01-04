package org.acme.geometry;

public class Point implements Geometry {

	private Coordinate coordinate;
	
	public Point() {
		this.coordinate = new Coordinate();
	}
	
	public Point(Coordinate coordinate) {
		if (!this.coordinate.isEmpty()) {
			this.coordinate = coordinate;
		}
	}
	
	public Coordinate getCoordinate() {
		return this.coordinate;
	}
	
	@Override
	public String getType() {
		return this.getClass().getName();
	}
	
	@Override
	public void translate(double dx, double dy) {
		double oldX = this.coordinate.getX();
		double oldY = this.coordinate.getY();
		this.coordinate.setX(oldX + dx);
		this.coordinate.setY(oldY + dy);
	}
	
	@Override
	public Point clone() {
		Point copy = this;
		return copy;
	}
	

}
