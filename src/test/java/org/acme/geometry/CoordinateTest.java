package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class CoordinateTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		Coordinate c = new Coordinate();
		Assert.assertEquals(0.0, c.getX(), EPSILON);
		Assert.assertEquals(0.0, c.getY(), EPSILON);
	}
	
	public void testXYConstructor(){
		Coordinate c = new Coordinate(4.0,6.0);
		Assert.assertEquals(4.0, c.getX(), EPSILON);
		Assert.assertEquals(6.0, c.getY(), EPSILON);
	}

}
