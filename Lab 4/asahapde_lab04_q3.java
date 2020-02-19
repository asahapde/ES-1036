package asahapde_lab04;

public class asahapde_lab04_q3 {
	public static void main(String[] args) {
		Square s = new Square(4.0);
		s.setSideLength(3.6);
		System.out.println("The area of the square is: " + s.computeArea());
		System.out.println("The perimeter of the square is: " + s.computePerimeter());
	}

}

abstract class Shape {
	protected int numberOfSides;
	protected double sideLength;

	protected abstract void setNumberOfSides(int num);

	protected abstract int getNumberOfSides();

	protected abstract void setSideLength(double length);

	protected abstract double getSideLength();

	public abstract double computeArea();

	public abstract double computePerimeter();
}

class Square extends Shape {

	public Square(double length) {
		setSideLength(length);
		setNumberOfSides(4);
	}

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

		return (getSideLength() * getSideLength());
	}

	public double computePerimeter() {

		return (getSideLength() * getNumberOfSides());
	}

}
