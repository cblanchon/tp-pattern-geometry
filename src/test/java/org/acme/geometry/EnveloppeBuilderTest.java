package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class EnveloppeBuilderTest {
	
	public static final double EPSILON = 1.0e-15;
	
	@Test
	public void testInsert() {
		
	}

	@Test
	public void testBuild() {
		EnveloppeBuilder builder = new EnveloppeBuilder();
		builder.insert(new Coordinate(0.0,1.0));
		builder.insert(new Coordinate(2.0,0.0));
		builder.insert(new Coordinate(1.0,3.0));
		Enveloppe result = builder.build();
		
		Coordinate bL = new Coordinate(0.0,0.0);
		Coordinate tR = new Coordinate(2.0,3.0);
		Enveloppe expect = new Enveloppe(bL,tR);
		
		Assert.assertEquals(result.getXmax(), expect.getXmax(),EPSILON);	
		Assert.assertEquals(result.getXmin(), expect.getXmin(),EPSILON);
		Assert.assertEquals(result.getYmax(), expect.getYmax(),EPSILON);
		Assert.assertEquals(result.getYmin(), expect.getYmin(),EPSILON);
	}
}