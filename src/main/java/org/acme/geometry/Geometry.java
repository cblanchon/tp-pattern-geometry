package org.acme.geometry;

public interface Geometry {
	
	public String getType();
	public void translate(double dx, double dy);
	public Geometry clone();
	public boolean isEmpty();
	public Enveloppe getEnveloppe();
	public void accept(GeometryVisitor visitor);
	public void addListener(GeometryListener listener);

}
