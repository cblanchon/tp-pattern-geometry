package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class GeometryWithCachedEnveloppeTest {
	
	@Test
	public void testGetEnvelope() {
		Geometry g = SampleFactory.createPointO();
		g = new GeometryWithCachedEnveloppe(g);
		Enveloppe e1 = g.getEnveloppe();
		Enveloppe e2 = g.getEnveloppe();
		Assert.assertSame(e1, e2);
	}

	@Test
	public void testType() {
		Geometry g = SampleFactory.createPointO();
		g = new GeometryWithCachedEnveloppe(g);
		Assert.assertEquals("Point", g.getType());
	}

	@Test
	public void testIsEmpty() {
		Geometry g = SampleFactory.createPointA();
		g = new GeometryWithCachedEnveloppe(g);
		Assert.assertFalse(g.isEmpty());
	}
}
