package org.acme.geometry;

public class Enveloppe {
	private Coordinate bottomLeft;
	private Coordinate topRight;
	
	public Enveloppe() {
		this.bottomLeft = new Coordinate();
		this.topRight = new Coordinate();
	}
	
	public Enveloppe(Coordinate bottomLeft, Coordinate topRight) {
		assert(bottomLeft != null && topRight != null);
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	}
	
	public boolean isEmpty() {
		return this.bottomLeft.isEmpty() || this.topRight.isEmpty();	
	}
	
	public double getXmax() {
		return this.topRight.getX();
		
	}
	
	public double getXmin() {
		return this.bottomLeft.getX();
		
	}
	
	public double getYmax() {
		return this.topRight.getY();
		
	}
	
	public double getYmin() {
		return this.bottomLeft.getY();
		
	}

}
