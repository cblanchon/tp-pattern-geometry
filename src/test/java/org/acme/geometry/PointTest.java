package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor(){
		Point p = new Point();
		Coordinate c = p.getCoordinate();
		double nan = Double.NaN; 
		Assert.assertEquals(nan, c.getX(), EPSILON);
		Assert.assertEquals(nan, c.getY(), EPSILON);
	}
	
/*	@Test
	public void testCoordConstructorNotEmpty(){
		Coordinate c = new Coordinate(0.3, 0.2);
		Point p = new Point(c);
		Coordinate pcoords = p.getCoordinate();
		Assert.assertEquals(c, pcoords);
	}
*/
	
}


