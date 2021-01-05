package org.acme.geometry;

public class EnveloppeBuilder implements GeometryVisitor{
	
	private Enveloppe enveloppe;
	
	public EnveloppeBuilder() {
		this.enveloppe = new Enveloppe();
	}
	
	
	public void insert(Coordinate coordinate) {
		assert(coordinate != null);
		if(this.enveloppe.isEmpty()) {
			this.enveloppe = new Enveloppe(coordinate, coordinate);
		}else {
			if(coordinate.getX() < this.enveloppe.getXmin() && coordinate.getY() < this.enveloppe.getYmin()) {
				this.enveloppe = new Enveloppe(
						coordinate, 
						new Coordinate(this.enveloppe.getXmax(), this.enveloppe.getYmax()));
			}
			if(coordinate.getX() < this.enveloppe.getXmin() && coordinate.getY() > this.enveloppe.getYmin()) {
				this.enveloppe = new Enveloppe(
						new Coordinate(coordinate.getX(), this.enveloppe.getYmin()), 
						new Coordinate(this.enveloppe.getXmax(), this.enveloppe.getYmax()));
			}
			if(coordinate.getX() > this.enveloppe.getXmin() && coordinate.getY() < this.enveloppe.getYmin()) {
				this.enveloppe = new Enveloppe(
						new Coordinate(this.enveloppe.getXmin(), coordinate.getY()), 
						new Coordinate(this.enveloppe.getXmax(), this.enveloppe.getYmax()));
			}
			
			if(coordinate.getX() > this.enveloppe.getXmax() && coordinate.getY() > this.enveloppe.getYmax()) {
				this.enveloppe = new Enveloppe(
						new Coordinate(this.enveloppe.getXmin(), this.enveloppe.getYmin()), 
						coordinate);
			}
			if(coordinate.getX() > this.enveloppe.getXmax() && coordinate.getY() < this.enveloppe.getYmax()) {
				this.enveloppe = new Enveloppe(
						new Coordinate(this.enveloppe.getXmin(), this.enveloppe.getYmin()), 
						new Coordinate(coordinate.getX(), this.enveloppe.getYmax()));
			}
			if(coordinate.getX() < this.enveloppe.getXmax() && coordinate.getY() > this.enveloppe.getYmax()) {
				this.enveloppe = new Enveloppe(
						new Coordinate(this.enveloppe.getXmin(), this.enveloppe.getYmin()), 
						new Coordinate(this.enveloppe.getXmax(), coordinate.getY()));
			}
		}
	}

	
	public Enveloppe build() {
		return this.enveloppe;
	}
	
	
	@Override
	public void visit(Point p) {
		this.insert(p.getCoordinate());
		
	}
	
	@Override
	public void visit(LineString l) {
		for(int i=0; i < l.getNumPoints(); i++) {
			visit(l.getPointN(i));
		}
		
	}
}
