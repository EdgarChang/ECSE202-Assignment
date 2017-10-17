package ca.mcgill.ecse202.a5;

public class Question4 {
  public static void main(String[] args) {
    // Tests if the entry is valid
    try {
      TriangleWithException t1 = new TriangleWithException(1.5, 2, 3);
      System.out.println("Perimeter for t1: " + t1.getPerimeter());
      System.out.println("Area for t1: " + t1.getArea());

      TriangleWithException t2 = new TriangleWithException(1, 2, 3);
      System.out.println("Perimeter for t2: " + t2.getPerimeter());
      System.out.println("Area for t2: " + t2.getArea());
    } catch (IllegalTriangleException ex) {
      // Prints message on the console if the entry is invalid
      System.out.println("Illegal triangle");
      System.out.println("Side1: " + ex.getSide1());
      System.out.println("Side2: " + ex.getSide2());
      System.out.println("Side3: " + ex.getSide3());
    }
  }
}


/**
 * A custom exception class to define illegal triangle entry
 * 
 * @author jj20337
 */
class IllegalTriangleException extends Exception {

  // Declares private double datafields for the class
  private double side1;
  private double side2;
  private double side3;

  // Constructs an exception
  IllegalTriangleException(double side1, double side2, double side3) {
    super("Invalid Triangle" + side1 + "" + side2 + "" + side3);
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  /**
   * A getter method returning side1
   * 
   * @return side1
   */
  public double getSide1() {
    return side1;
  }

  /**
   * A getter method returning side2
   * 
   * @return side2
   */
  public double getSide2() {
    return side2;
  }

  /**
   * A getter method returning side3
   * 
   * @return side3
   */
  public double getSide3() {
    return side3;
  }
}


/**
 * A modified Triangle class that includes exception
 * 
 * @author jj20337
 */
class TriangleWithException extends GeometricObject {
  // Declares private double datafields of the class
  private double side1 = 1;
  private double side2 = 1;
  private double side3 = 1;

  // Declares a no arg constructor for the class
  public TriangleWithException() {}

  /** Construct a triangle with specified sides */
  public TriangleWithException(double side1, double side2, double side3)
      throws IllegalTriangleException {
    // Checks if the triangle entry is valid
    if ((side1 + side2) > side3 && (side2 + side3) > side1 && (side1 + side3) > side2) {
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
    } else {
      throw new IllegalTriangleException(side1, side2, side3);
    }
  }

  /**
   * A getter method returning side1
   * 
   * @return side1
   */
  public double getSide1() {
    return side1;
  }

  /**
   * A getter method returning side2
   * 
   * @return side2
   */
  public double getSide2() {
    return side2;
  }

  /**
   * A getter method returning side3
   * 
   * @return side3
   */
  public double getSide3() {
    return side3;
  }

  /**
   * A method that calculates the triangle's area
   * 
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
   * 
   * @return perimeter a double value
   */
  @Override
  public double getPerimeter() {
    double perimeter = this.side1 + this.side2 + this.side3;
    return perimeter;
  }

  /**
   * A method that reports the values of the triangle's sides
   * 
   * @return description a String variable
   */
  public String toString(Triangle t1) {
    String description = "Triangle: side1 = " + t1.getSide1() + " side2 = " + t1.getSide2()
        + " side3 = " + t1.getSide3();
    return description;
  }
}
