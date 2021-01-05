package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractGeometry implements Geometry{
	
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

}
