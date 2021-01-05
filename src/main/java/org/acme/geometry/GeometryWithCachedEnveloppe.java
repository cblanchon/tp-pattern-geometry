package org.acme.geometry;

public class GeometryWithCachedEnveloppe implements Geometry, GeometryListener {
	
	private Geometry geom;
	private Enveloppe cachedEnveloppe;

	public GeometryWithCachedEnveloppe(Geometry geom) {
		this.geom = geom;
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
			this.addListener(this);
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

	@Override
	public void addListener(GeometryListener listener) {
		this.geom.addListener(listener);
		
	}

	@Override
	public void onChange(Geometry geometry) {
		this.cachedEnveloppe = geometry.getEnveloppe();
		
	}
}
