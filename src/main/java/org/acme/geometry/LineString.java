package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public class LineString implements Geometry {
	
	private List<Point> points;
	
	
	public LineString() {
		this.points = new ArrayList<>();;
		
	}
	
	public LineString(List<Point> points) {
		assert (points!=null);
		this.points = points;
	}
	
	public int getNumPoints() {
		return this.points.size();
	}
	
	public Point getPointN(int n) {
		return this.points.get(n);
	}

	@Override
	public String getType() {
		return this.getClass().getName();
	}
	
	@Override
	public void translate(double dx, double dy) {
		for (int i=0 ; i < this.getNumPoints() ; i++) {
			Point currP = this.getPointN(i);
			double oldX = currP.getCoordinate().getX();
			double oldY = currP.getCoordinate().getY();
			currP.getCoordinate().setX(oldX + dx);
			currP.getCoordinate().setY(oldY + dy);
			
		}

	}
	
	@Override
	public LineString clone() {
		List<Point> newpoints = new ArrayList<>(getNumPoints());
		for (Point point : points) {
			newpoints.add(point);
		}
		return;
	}

}
