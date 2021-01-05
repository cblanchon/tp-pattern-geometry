package org.acme.geometry;

import java.io.PrintStream;

public class LogGeometryVisitor implements GeometryVisitor{
	private PrintStream out;
	
	
	public LogGeometryVisitor(PrintStream out) {
		this.out = out;
	}
	
	public void visit(Point point) {
		this.out.print("Geometry : "+point.getType()+" , coordinates : x="+
				Double.toString(point.getCoordinate().getX())+", y="+
				Double.toString(point.getCoordinate().getY()));
	}
	
	public void visit(LineString lineString) {
		this.out.print("Geometry : "+lineString.getType()+" built of "+
				Integer.toString(lineString.getNumPoints())+" point(s)");
	}
	
}
