import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TriangleTests {
	
	@Test(expected = Shape.ZeroSizeEdgeException.class)
	public void zeroEdgeSize_expectError() {
		new Triangle(10,20,0);
	}
	
	@Test(expected = Shape.NegativeSizeEdgeException.class)
	public void negativeEdgeSize_expectError() {
		new Triangle(-10,20,5);
	}
	
	@Test
	public void checkEquilateral() {
		Triangle myTriangle= new Triangle(10,10,10);
		
		TriangleType myType=myTriangle.getTriangleType();
		
		assertEquals("The given triangle should be equilateral.", TriangleType.EQUILATERAL, myType);
	}
	
	@Test
	public void checkIsosceles() {
		Triangle myTriangle= new Triangle(10,10,20);
		
		TriangleType myType=myTriangle.getTriangleType();
		
		assertEquals("The given triangle should be isosceles.", TriangleType.ISOSCELES, myType);
	}
	
	@Test
	public void checkScalene() {
		Triangle myTriangle= new Triangle(5,10,7);
		
		TriangleType myType=myTriangle.getTriangleType();
		
		assertEquals("The given triangle should be scalene.", TriangleType.SCALENE, myType);
	}
}
