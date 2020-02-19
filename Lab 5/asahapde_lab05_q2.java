/* A short program that will compute the perimeter and area of different shapes using class inheritance 
 * Author: Abdullah Sahapdeen
 * Date: 11/15/2018
 * Section: 004-3C2415
 */
package asahapde_lab05;

public class asahapde_lab05_q2 {

	public static void main(String[] args) {
		Square s = new Square(3.6);
		Circle c = new Circle(2);
		
		s.setSideLength(4.0);
		System.out.println("The area of the square is: " + s.computeArea());
		System.out.println("The perimeter of the square is: " + s.computePerimeter());
		
		c.setSideLength(9.0);
		System.out.println("The area of the circle is: " + c.computeArea());
		System.out.println("The perimeter of the circle is: " + c.computePerimeter());
		
		s.computeDistance();
	}

}

class Shape {
	private int numberOfSides;
	private double sideLength;

	protected void setNumberOfSides(int num) {
		numberOfSides = num;
	}

	protected int getNumberOfSides() {
		return numberOfSides;
	}

	protected void setSideLength(double length) {
		sideLength = length;
	}

	protected double getSideLength() {
		return sideLength;
	}

	public double computeArea() {
		System.out.println("Calling superclass computeArea");
		return 0;
	}

	public double computePerimeter() {
		System.out.println("Calling superclass computePerimeter");
		return 0;
	}
}

class Square extends Shape {
	public Square(double sideLength) {
		setSideLength(sideLength);
		setNumberOfSides(4);
	}

	public double computeArea() {
		super.computeArea();
		return (getSideLength()*getSideLength());
	}

	public double computePerimeter() {
		super.computePerimeter();
		return (getSideLength()*getNumberOfSides());
	}
	
	public void computeDistance() {
		double hypotenuse; 
		hypotenuse = Math.sqrt((Math.pow(getSideLength(),2)) + (Math.pow(getSideLength(),2)));
		
		System.out.println("The distance between top left corner and top right corner is " + getSideLength());
		System.out.println("The distance between top left corner and bottom right corner is " + hypotenuse);
		System.out.println("The distance between top left corner and bottom corner is " + getSideLength());
	}
}

class Circle extends Shape{
	
	public Circle(double sideLength) {
		setSideLength(sideLength);
		setNumberOfSides(1);
	}
	
	public double computeArea() {
		super.computeArea();
		return (getSideLength()*getSideLength()*Math.PI);
	}

	public double computePerimeter() {
		super.computePerimeter();
		return (getSideLength()*2*Math.PI);
	}
}
