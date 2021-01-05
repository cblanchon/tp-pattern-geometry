package org.acme.geometry;

public interface Geometry {
	
	public String getType();
	public void translate(double dx, double dy);
	public Geometry clone();
	public Boolean isEmpty();
	public Enveloppe getEnveloppe();

}
