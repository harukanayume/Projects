package source;

public class Main {

	public static void main(String[] args) {
		Triangle myTriangle = Triangle.triangleFromPrompt(); 
		System.out.println(myTriangle.getTriangleType());
	}

}