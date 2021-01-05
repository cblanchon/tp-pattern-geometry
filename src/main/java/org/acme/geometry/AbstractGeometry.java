package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGeometry implements Geometry {
	
	private List<GeometryListener> listeners = new ArrayList<GeometryListener>();
	
	@Override
	public Geometry clone() {
		return this.clone();
	}
	
	public String asText() {
		WktVisitor visitor = new WktVisitor();
		this.accept(visitor);
		return visitor.getResult();
	}
	
	public Enveloppe getEnvelope() {
		EnveloppeBuilder builder = new EnveloppeBuilder();
		this.accept(builder);
		return builder.build();
	}
	
	
	
	public void addListener(GeometryListener listener) {
		this.listeners.add(listener);
	}

	protected void triggerChange() {
		for(int i=0; i < this.listeners.size(); i++) {
			listeners.get(i).onChange(this);
		}
	}

}
