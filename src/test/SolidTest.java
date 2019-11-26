package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import stl.Point3D;
import stl.Solid;
import stl.Facet;

class SolidTest {
	private final Solid testSolid = new Solid();
	private final Solid testSolidEmpty = new Solid();
	private final Solid testSolidFacet = new Solid();
	
	@Test
	void testInvalid() {
		assertFalse(testSolid.addFacet(new Point3D(1,2,3)));
		assertEquals(testSolid.toString(), testSolidEmpty.toString());
		
	}
	
	@Test
	void  test3()
	{
		Facet testFacet = new Facet(new Point3D(1,2,3),new Point3D(2,2,3),new Point3D(3,2,3));
		testSolidFacet.addFacet(testFacet);
 		assertTrue(testSolid.addFacet(new Point3D(1,2,3),new Point3D(2,2,3),new Point3D(3,2,3)));
 		assertEquals(testSolid.toString(), testSolidFacet.toString());
 		 
		
	}
	@Test
	void test4() {
		Solid test4Solid4Points = new Solid();
		Solid test4Solid4 = new Solid();
		Facet testFacet = new Facet(new Point3D(1,2,3),new Point3D(2,3,4),new Point3D(3,4,5));
		Facet testFacet1 = new Facet(new Point3D(1,2,3),new Point3D(3,4,5),new Point3D(4,5,6));
		test4Solid4.addFacet(testFacet);
		test4Solid4.addFacet(testFacet1);
		assertTrue(test4Solid4Points.addFacet(new Point3D(1,2,3),new Point3D(2,3,4),new Point3D(3,4,5),new Point3D(4,5,6)));
		assertEquals(test4Solid4Points.toString(), test4Solid4.toString());

		 
	}
	@Test
	void test5() {
		
		
	}
	

}
