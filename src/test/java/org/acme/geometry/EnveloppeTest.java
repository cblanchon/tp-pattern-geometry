package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class EnveloppeTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testDefaultConstructor() {
		EnveloppeBuilder builder = new EnveloppeBuilder();
		Enveloppe result = builder.build();
		Assert.assertTrue(result.isEmpty());
	}
	
	
	@Test
	public void testInsertCases() {
		EnveloppeBuilder builder = new EnveloppeBuilder();
		
		builder.insert(new Coordinate(-1.0, 1.0));
		builder.insert(new Coordinate(2.0, 0.0));
		builder.insert(new Coordinate(7.0, 6.0));
		builder.insert(new Coordinate(1.0, 3.0));
		builder.insert(new Coordinate(7.0, 2.0));
		
		Enveloppe result = builder.build();
		
		Assert.assertEquals(7.0, result.getXmax(), EPSILON);
		Assert.assertEquals(6.0, result.getYmax(), EPSILON);
		Assert.assertEquals(-1.0, result.getXmin(), EPSILON);
		Assert.assertEquals(0.0, result.getYmin(), EPSILON);
	
	}
	
	

}
