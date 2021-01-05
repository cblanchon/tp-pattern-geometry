package org.acme.geometry;

public class Enveloppe {
	private Coordinate bottomLeft;
	private Coordinate topRight;
	
	public Enveloppe() {
		
	}
	
	public Enveloppe(Coordinate bottomLeft, Coordinate topRight) {
		this.bottomLeft = bottomLeft;
		this.topRight = topRight;
	}
	
	public Boolean isEmpty() {
		if (Double.isNaN(this.bottomLeft.getX()) || Double.isNaN(this.bottomLeft.getY()) || Double.isNaN(this.topRight.getX()) ||Double.isNaN(this.topRight.getY())) {
			return true;
		}
		return false;	
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
