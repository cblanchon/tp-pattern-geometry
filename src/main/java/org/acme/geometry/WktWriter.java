package org.acme.geometry;

public class WktWriter {
	public static final String LINE = System.getProperty("line.separator");
	
	public String write(Geometry geom) {
		String wktString = "";
		if ( geom instanceof Point ){
		    Point point = (Point)geom;
		    wktString += point.getType().toUpperCase();
		    if(point.isEmpty()) {
		    	wktString += " EMPTY";
		    }else {
		    	wktString += "("+Double.toString(point.getCoordinate().getX()) +
		    			" "+Double.toString(point.getCoordinate().getY())+")";
		    }
		}else if ( geom instanceof LineString ){
		    LineString lineString = (LineString)geom;
		    wktString += lineString.getType().toUpperCase();
		    if(lineString.isEmpty()) {
		    	wktString += " EMPTY";
		    }else {
		    	wktString += "(";
		    	for(int i=0; i < lineString.getNumPoints(); i++) {
		    		Point p = lineString.getPointN(i);
    				wktString += Double.toString(p.getCoordinate().getX()) +
	    			" "+Double.toString(p.getCoordinate().getY());
    				if(i != lineString.getNumPoints() - 1) {
    					wktString += ",";
    				}
		    	}
		    	wktString += ")";
		    }
		}else{
		    throw new RuntimeException("Geometry type not supported");
		}
		
		return wktString;
	}
}
