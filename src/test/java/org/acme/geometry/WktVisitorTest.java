package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class WktVisitorTest {
	
	@Test
	public void testVisitPoint() {
		AbstractGeometry ag = new Point(new Coordinate(1.0,8.0));
		Assert.assertEquals("POINT(1.0 8.0)", ag.asText());
	}
	
	@Test
	public void testWriteLineString() {
		AbstractGeometry ag = SampleFactory.createLineStringOA();
		Assert.assertEquals("LINESTRING(0.0 0.0,4.0 5.0)", ag.asText());
	}
	
	@Test
	public void testVisitEmptyPoint() {
		AbstractGeometry ag = new Point();
		Assert.assertEquals("POINT EMPTY", ag.asText());
	}
	
	@Test
	public void testWriteEmptyLineString() {
		AbstractGeometry ag = new LineString();
		Assert.assertEquals("LINESTRING EMPTY", ag.asText());
	}

}
