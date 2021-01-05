package org.acme.geometry;

public class GeometryWithCachedEnveloppe implements Geometry {
	private Geometry geom;
	private Enveloppe cachedEnveloppe;

	public GeometryWithCachedEnveloppe(Geometry g) {
		this.geom = g;
	}
	
	@Override
	public boolean isEmpty() {
		return this.geom.isEmpty();
	}
	
	@Override
	public String getType() {
		return this.geom.getType();
	}



	@Override
	public void translate(double dx, double dy) {
		this.geom.translate(dx, dy);

	}

	@Override
	public Enveloppe getEnveloppe() {
		if(this.cachedEnveloppe == null) {
			this.cachedEnveloppe = this.geom.getEnveloppe();
		}
		return this.cachedEnveloppe;
	}

	@Override
	public void accept(GeometryVisitor visitor) {
		this.geom.accept(visitor);

	}

	@Override
	public Geometry clone() {
		return this.geom.clone();
	}
}
