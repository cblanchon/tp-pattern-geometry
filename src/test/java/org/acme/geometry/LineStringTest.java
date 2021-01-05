package org.acme.geometry;

import org.junit.Assert;
import org.junit.Test;

public class LineStringTest {
	
	
	
	
	@Test
	public void testClone() {
		LineString oa = SampleFactory.createLineStringOA();
		LineString cloneOA = oa.clone();
	}
	

}
