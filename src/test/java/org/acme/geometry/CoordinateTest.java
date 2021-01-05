package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		Coordinate c = new Coordinate();
		double nan = Double.NaN; 
		Assert.assertEquals(nan, c.getX(), EPSILON);
		Assert.assertEquals(nan, c.getY(), EPSILON);
	}
	
	@Test
	public void testXYConstructor(){
		Coordinate c = new Coordinate(4.0,6.0);
		Assert.assertFalse(c.isEmpty());
		Assert.assertEquals(4.0, c.getX(), EPSILON);
		Assert.assertEquals(6.0, c.getY(), EPSILON);
	}
	
	@Test
	public void testIsEmptyTrue(){
		double x = Double.NaN;
		double y = Double.NaN;
		Coordinate c = new Coordinate(x,y);
		Assert.assertTrue(c.isEmpty());
	}

	@Test
	public void testIsEmptyFalse(){
		Coordinate c = new Coordinate(4.0,6.0);
		Assert.assertFalse(c.isEmpty());
	}
}
