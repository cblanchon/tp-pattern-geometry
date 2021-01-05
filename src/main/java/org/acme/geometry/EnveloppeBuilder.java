package org.acme.geometry;

import java.util.ArrayList;
import java.util.Collections;

public class EnveloppeBuilder {
	
	private ArrayList<Double> listX;
	private ArrayList<Double> listY;
	
	public void insert(Coordinate coordinate) {
		listX.add(coordinate.getX());
		listY.add(coordinate.getY());
	}
	
	public Enveloppe build() {
		double xmax = Collections.max(listX);
		double xmin = Collections.min(listX);
		
		double ymax = Collections.max(listY);
		double ymin = Collections.min(listY);
		
		Coordinate bottomLeft = new Coordinate(xmin,ymin);
		Coordinate topRight = new Coordinate(xmax,ymax);
		
		Enveloppe enveloppe = new Enveloppe(bottomLeft, topRight);
		return enveloppe;
	}

}
