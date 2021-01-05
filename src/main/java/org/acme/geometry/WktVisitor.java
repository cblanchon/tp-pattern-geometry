package org.acme.geometry;

public class WktVisitor implements GeometryVisitor {
	
	private String newWktString;
	
	@Override
	public void visit(Point p) {
		this.newWktString = p.getType().toUpperCase();
	    if(p.isEmpty()) {
	    	this.newWktString += " EMPTY";
	    }else {
	    	this.newWktString += "("+Double.toString(p.getCoordinate().getX()) +
	    			" "+Double.toString(p.getCoordinate().getY())+")";
	    }

	}

	@Override
	public void visit(LineString l) {
		this.newWktString = l.getType().toUpperCase();
	    if(l.isEmpty()) {
	    	this.newWktString += " EMPTY";
	    }else {
	    	this.newWktString += "(";
	    	for(int i=0; i < l.getNumPoints(); i++) {
	    		Point p = l.getPointN(i);
	    		this.newWktString += Double.toString(p.getCoordinate().getX()) +
    			" "+Double.toString(p.getCoordinate().getY());
				if(i != l.getNumPoints() - 1) {
					this.newWktString += ",";
				}
	    	}
	    	this.newWktString += ")";
	    }

	}
	
	
	public String getResult() {
		return this.newWktString;
	}

}
