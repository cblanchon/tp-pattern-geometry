package org.acme.geometry;

import java.util.List;

public class LineString implements Geometry {
	
	private List<Point> points;
	
	
	public LineString() {
		List<Point> points = null;
		points.add(new Point());
		points.add(new Point());
		this.points = points;
		
	}
	
	public LineString(List<Point> points) {
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

}
