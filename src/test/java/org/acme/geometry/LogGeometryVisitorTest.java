package org.acme.geometry;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Assert;
import org.junit.Test;

public class LogGeometryVisitorTest {
	
	@Test
	public void testVisitPoint() {
		String result = "Geometry : Point , coordinates : x=1.0, y=8.0";
		ByteArrayOutputStream outStr = new ByteArrayOutputStream();
		PrintStream out = new PrintStream(outStr);
		LogGeometryVisitor visitor = new LogGeometryVisitor(out);
		Geometry geometry = new Point(new Coordinate(1.0,8.0));
		geometry.accept(visitor);
		Assert.assertEquals(result, outStr.toString());
	}
	
	@Test
	public void testVisitLineString() {
		String result = "Geometry : LineString built of 2 point(s)"; 
		ByteArrayOutputStream outStr = new ByteArrayOutputStream();
		PrintStream out = new PrintStream(outStr);
		LogGeometryVisitor visitor = new LogGeometryVisitor(out);
		Geometry geometry = SampleFactory.createLineStringOA();
		geometry.accept(visitor);
		Assert.assertEquals(result, outStr.toString());
	}

}
