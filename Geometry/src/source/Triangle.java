package source;
import java.util.Scanner;

public class Triangle extends Shape{

	private TriangleType type; 

	public Triangle(double edge1, double edge2, double edge3) {
		edges=new double [3];
		this.edges[0]=edge1;
		this.edges[1]=edge2;
		this.edges[2]=edge3;
		
		validate();
	}

	public static Triangle triangleFromPrompt() {
		Scanner input = new Scanner(System.in);
		System.out.println("enter edge 1 as numerical");
		double edge1 = input.nextDouble();
		System.out.println("enter edge 2 as numerical");
		double edge2 = input.nextDouble();
		System.out.println("enter edge 3 as numerical");
		double edge3 = input.nextDouble();
		input.close();
		Triangle myTriangle =new Triangle(edge1,edge2,edge3);
		return myTriangle;
	}

	private boolean isEquilateral() {
		return edges[0]==edges[1] && edges[1]==edges[2];
	}

	private boolean isIsosceles() {
		return !this.isEquilateral() && (edges[0]==edges[1] || edges[1]==edges[2] ||edges[0]==edges[2]);
	}

	public TriangleType getTriangleType() {	
		if(type==null) {
			if(isIsosceles()) {
				type=TriangleType.ISOSCELES;
			} else if(isEquilateral()) {
				type=TriangleType.EQUILATERAL;
			} else {
				type=TriangleType.SCALENE;
			}			
		}
		return type;
	}
}
