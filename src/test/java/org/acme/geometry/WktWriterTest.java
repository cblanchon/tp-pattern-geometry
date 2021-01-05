package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class WktWriterTest {
	@Test
	public void testWritePoint() {
		Geometry g = new Point(new Coordinate(3.0,4.0));
		WktWriter writer = new WktWriter();
		Assert.assertEquals("POINT(3.0 4.0)", writer.write(g));
	}
	
	@Test
	public void testWriteEmptyPoint() {
		Geometry g = new Point();
		WktWriter writer = new WktWriter();
		Assert.assertEquals("POINT EMPTY", writer.write(g));
	}
	
	@Test
	public void testWriteLineString() {
		Geometry g = SampleFactory.createLineStringOA();
		WktWriter writer = new WktWriter();
		Assert.assertEquals("LINESTRING(0.0 0.0,4.0 5.0)", writer.write(g));
	}
	
	@Test
	public void testWriteEmptyLineString() {
		Geometry g = new LineString();
		WktWriter writer = new WktWriter();
		Assert.assertEquals("LINESTRING EMPTY", writer.write(g));
	}

}
