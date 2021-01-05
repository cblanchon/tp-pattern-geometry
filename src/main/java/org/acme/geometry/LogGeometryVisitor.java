package org.acme.geometry;

import java.io.PrintStream;

public class LogGeometryVisitor implements GeometryVisitor{
	private PrintStream out;
	
	
	public LogGeometryVisitor(PrintStream out) {
		this.out = out;
	}
	
	public void visit(Point point) {
		this.out.print("I'm a "+point.getType()+" x="+
				Double.toString(point.getCoordinate().getX())+", y="+
				Double.toString(point.getCoordinate().getY()));
	}
	
	public void visit(LineString lineString) {
		this.out.print("I'm a "+lineString.getType()+" I am build of "+
				Integer.toString(lineString.getNumPoints())+" point(s)");
	}
	
}
