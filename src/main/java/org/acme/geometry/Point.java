package org.acme.geometry;

public class Point extends AbstractGeometry implements Geometry {
	public static final String TYPE = "Point";

	private Coordinate coordinate;
	
	public Point() {
		this.coordinate = new Coordinate();
	}
	
	public Point(Coordinate coordinate) {
		assert(coordinate != null);
		this.coordinate = coordinate;
	}
	
	public Coordinate getCoordinate() {
		return this.coordinate;
	}
	
	@Override
	public String getType() {
		return TYPE;
	}
	
	@Override
	public boolean isEmpty() {
		return this.coordinate.isEmpty();
	}
	
	@Override
	public void translate(double dx, double dy) {
		this.coordinate = new Coordinate(this.coordinate.getX() + dx, this.coordinate.getY() + dy);		
	}
	
	@Override
	public Point clone() {
		return new Point(coordinate);
	}


	@Override
	public Enveloppe getEnveloppe() {
		EnveloppeBuilder builder = new EnveloppeBuilder();
		builder.insert(this.coordinate);
		return builder.build();
	}
	
	@Override
	public void accept(GeometryVisitor visitor) {
		visitor.visit(this);
	}
	
}
