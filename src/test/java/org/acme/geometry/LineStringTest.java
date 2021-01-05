package org.acme.geometry;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test 
	public void testDefaultConstructor() {
		Coordinate c = new Coordinate();
		Assert.assertEquals(0.0, c.getX(), EPSILON);
		Assert.assertEquals(0.0, c.getX(), EPSILON);
	}
	
	@Test
	public void testGetType() {
		LineString l = new LineString();
		Assert.assertEquals("LineString", l.getType());
	}
	
	@Test
	public void testIsEmpty() {
		LineString empty = new LineString();
		Assert.assertTrue(empty.isEmpty());
		Assert.assertFalse(SampleFactory.createLineStringOA().isEmpty());
	}
	
	@Test
	public void testGetNumPoints() {
		LineString oa = SampleFactory.createLineStringOA();
		Assert.assertEquals(2, oa.getNumPoints());
	}	
	
	@Test
	public void testGetPointN() {
		LineString oa = SampleFactory.createLineStringOA();
		Assert.assertEquals(4.0,  oa.getPointN(1).getCoordinate().getX(),EPSILON);
		Assert.assertEquals(5.0,  oa.getPointN(1).getCoordinate().getY(),EPSILON);
	}
	
	
	@Test
	public void testTranslate() {
		List<Point> points = new ArrayList<>();
		points.add(new Point(new Coordinate(0.0, 0.0)));
		points.add(new Point(new Coordinate(4.0, 5.0)));
		
		LineString l = new LineString(points);
		l.translate(2.0, 3.0);
		
		{
			Point p = l.getPointN(0);
			Assert.assertEquals(2.0, p.getCoordinate().getX(), EPSILON);
			Assert.assertEquals(3.0, p.getCoordinate().getY(), EPSILON);
		}		
		{
			Point p = l.getPointN(1);
			Assert.assertEquals(6.0, p.getCoordinate().getX(), EPSILON);
			Assert.assertEquals(8.0, p.getCoordinate().getY(), EPSILON);
		}
		
	}	
	
	
	@Test
	public void testClone() {
		LineString oa = SampleFactory.createLineStringOA();
		LineString cloneOA = oa.clone();
		Assert.assertEquals(0.0, cloneOA.getPointN(0).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(0.0, cloneOA.getPointN(0).getCoordinate().getY(), EPSILON);
		Assert.assertEquals(4.0, cloneOA.getPointN(1).getCoordinate().getX(), EPSILON);
		Assert.assertEquals(5.0, cloneOA.getPointN(1).getCoordinate().getY(), EPSILON);
		Assert.assertNotSame(oa.getPointN(0), cloneOA.getPointN(0));
		Assert.assertNotSame(oa.getPointN(1), cloneOA.getPointN(1));
	}
	
	
	
	@Test
	public void testGetEnveloppe() {
		LineString l = SampleFactory.createLineStringOA();
		Enveloppe e = l.getEnveloppe();
		Assert.assertEquals(0.0, e.getXmin(),EPSILON);
		Assert.assertEquals(4.0, e.getXmax(),EPSILON);
		Assert.assertEquals(0.0, e.getYmin(),EPSILON);
		Assert.assertEquals(5.0, e.getYmax(),EPSILON);
	}
	
}
