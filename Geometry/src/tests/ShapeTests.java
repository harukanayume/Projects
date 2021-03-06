package tests;
import org.junit.Test;

import source.Shape;

public class ShapeTests {

	@Test(expected = Shape.ZeroSizeEdgeException.class)
	public void zeroEdgeSize_expectError() {
		new Shape(new double[] {0} );
	}
	
	@Test(expected = Shape.NegativeSizeEdgeException.class)
	public void negativeEdgeSize_expectError() {
		new Shape(new double[] {-10});
	}
}
