/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dallas Lawson
 */
public class Exercise_13_10 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3, 5, "blue", true);
		Rectangle r2 = new Rectangle(5, 3, "gray", false);
		Rectangle r3 = new Rectangle(3.1, 5, "blue", true);
		System.out.println("Rectangle1 Area :" + r1.getArea());
		System.out.println("Rectangle2 Area :" + r2.getArea());
		System.out.println("Rectangle3 Area :" + r3.getArea());
		System.out.println("Rectangle1 is " + (r1.equals(r2) ? "" : "not ") +
			"equal to Rectangle2");
		System.out.println("Rectangle1 is " + (r1.equals(r3) ? "" : "not ") +
			"equal to Rectangle3");
	}
}

public abstract class GeometricObject {
	private String color = "while";
	private boolean filled;
	private java.util.Date dateCreated;
	protected GeometricObject() {
		dateCreated = new java.util.Date();
	}
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	@Override
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color +
			" and filled: " + filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();

}

public class Rectangle
		extends GeometricObject implements Comparable<Rectangle> {
	private double width;
	private double height;
	public Rectangle() {
	}
	public Rectangle(
		double width, double height) {
		this.width = width;
		this.height = height;
	}
	public Rectangle(
		double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this. width = width;
	}
	public double getheight() {
		return height;
	}
	public void setheight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}
	@Override
	public double getPerimeter() {
		return 2 * (width * height);
	}

	@Override
	public int compareTo(Rectangle o) {
		if (getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	@Override /** Return true if both objects are equal */
	public boolean equals(Object o) {
		return this.compareTo((Rectangle)o) == 0;
	}
	@Override /** Return String discription of this rectangle */
	public String toString() {
		return super.toString() + "\nWidth: " + width + "\nHeight: " + height
			+ "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
	}
}