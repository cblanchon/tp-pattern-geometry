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
	public void testGetType() {
		Point p = new Point();
		Assert.assertEquals("Point", p.getType());
	}
	
	@Test
	public void testIsEmpty() {
		Coordinate c = Mockito.mock(Coordinate.class);
		Mockito.when(c.isEmpty()).thenReturn(true);
		Point p = new Point(c);
		Assert.assertTrue(p.isEmpty());
	}
	
	
	@Test
	public void testTranslate() {
		Point p = new Point(new Coordinate(4.0, 5.0));
		p.translate(2.0, 3.0);
		Assert.assertEquals(6.0, p.getCoordinate().getX(), EPSILON);
		Assert.assertEquals(8.0, p.getCoordinate().getY(), EPSILON);
	}
	
	@Test
	public void testClone() {
		Point p = new Point(new Coordinate(4.0, 5.0));
		Point copy = p.clone();
		Assert.assertNotSame(p, copy);
		Assert.assertSame(p.getCoordinate(), copy.getCoordinate());
	}
	
}


