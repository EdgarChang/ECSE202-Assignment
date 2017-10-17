package ca.mcgill.ecse202.a5;

import java.util.Scanner;

public class Question2 {

  public static void main(String[] args) {
    
    // Imports a new scanner object
    Scanner input = new Scanner(System.in);

    // Prompts the user to enter value for triangle sides
    System.out.println("Enter three sides: ");
    
    // Stores user inputs in three double variables
    double side1 = input.nextDouble();
    double side2 = input.nextDouble();
    double side3 = input.nextDouble();

    // Declare a new Triangle object
    Triangle example = new Triangle(side1, side2, side3);

    // Prompts the user to enter the color for the triangle
    System.out.println("Enter the color: ");

    // Stores user input in a String variable
    String color = input.next();

    // Invokes the setColor method
    example.setColor(color);

    // Prompts the user to enter a boolean value to determine whether the triangle is filled
    System.out.println("Enter a boolean value for filled: ");

    // Declares a boolean variable to store user input
    boolean fill = input.nextBoolean();

    // Invokes the setFilled method
    example.setFilled(fill);

    // Displays the triangle information on the consolee
    System.out.println("The area is " + example.getArea());
    System.out.println("The perimeter is " + example.getPerimeter());
    System.out.println("The triangle is " + example.isFilled());
    System.out.println("The color of the triangle is " + example.getColor());
    System.out.println(example.toString(example));

  }
}

/**
 * A class extending GeometricObject class that calculates area and perimeter of a triangle and
 * returns the description of the triangle
 * @author edgarchang
 */
class Triangle extends GeometricObject {
  
  // Declares three private double datafield
  private double side1 = 1;
  private double side2 = 1;
  private double side3 = 1;

  // Declares a no arg constructor
  public Triangle() {}

  // Creates a constructor for the class Triangle
  public Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  /**
   * A getter method to get side1
   * @return side1
   */
  public double getSide1() {
    return side1;
  }
  /**
   * A getter method to get side2
   * @return side2
   */
  public double getSide2() {
    return side2;
  }
  
  /**
   * A getter method to get side3
   * @return side3
   */
  public double getSide3() {
    return side3;
  }


  
  /**
   * A method that calculates the triangle's area
   * @return area a double value
   */
  @Override
  public double getArea() {
    double p = (this.side1 + this.side2 + this.side3) / 2;
    double area = Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    return area;
  }

  /**
   * A method that calculates the triangle's perimeter
   * @return perimeter a double value
   */
  @Override
  public double getPerimeter() {
    double perimeter = this.side1 + this.side2 + this.side3;
    return perimeter;
  }
  
  /**
   * A method that reports the values of the triangle's sides
   * @return description a String variable
   */
  public String toString(Triangle t1) {
    String description = "Triangle: side1 = " + t1.getSide1() + " side2 = " + t1.getSide2()
        + " side3 = " + t1.getSide3();
    return description;
  }

}


