package source;

public class Shape {

	protected double[] edges;
	
	public Shape() {}
	
	public Shape(double[] edges) {
		this.edges=edges;
		validate();
	}
	
	protected void validate() {
		checkForIllegalSizeEdges();
	}

	private void checkForIllegalSizeEdges() {
		for(double edge : edges) {
			if(edge<0) {  
				throw new NegativeSizeEdgeException();
			}
			if(edge==0) {  
				throw new ZeroSizeEdgeException();
			}	
		}
	}
	
	public class ZeroSizeEdgeException extends RuntimeException {}
	public class NegativeSizeEdgeException extends RuntimeException {}
}
