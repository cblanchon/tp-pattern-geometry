package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

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
	
	@Test
	
public void testIsEmpty() {
		Coordinate c = Mockito.mock(Coordinate.class);
		Mockito.when(c.isEmpty()).thenReturn(true);
		Point g = new Point(c);
		Assert.assertTrue(g.isEmpty());
	}
	
}


