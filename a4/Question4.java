package ca.mcgill.ecse202.a4;

/**
 * A class that tests the methods declared in class MyInteger
 * 
 * @author edgar chang
 *
 */
public class Question4 {
  public static void main(String[] args) {
    // Declares new MyInteger objects, char array and string variable used to test the methods
    MyInteger number1 = new MyInteger(5);
    MyInteger number2 = new MyInteger(10);
    char[] list1 = {'1', '2', '3', '8'};
    String list2 = "12345";

    // Prints the numbers being tested on the console
    System.out.println("The numbers being tested are:\nnumber1: 5, number2: 10");

    // Tests if number1 is even using the isEven method and prints the result on the console
    System.out.println("Is number1 even? " + number1.isEven());

    // Tests if 10 is even using the isEven(int a) method and prints the result on the console
    System.out.println("Is number2 even? " + MyInteger.isEven(10));

    // Tests if number1 is even using the isEven(MyInteger a) method and prints the result on the
    // console
    System.out.println("Is number1 even? " + MyInteger.isEven(number1));

    // Tests if number1 is odd using the isOdd method and prints the result on the console
    System.out.println("Is number1 odd? " + number1.isOdd());

    // Tests if 10 is odd using the isOdd(int a) method and prints the result on the console
    System.out.println("Is number2 odd? " + MyInteger.isOdd(10));

    // Tests if number1 is odd using the isOdd(MyInteger a) method and prints the result on the
    // console
    System.out.println("Is number1 odd? " + MyInteger.isOdd(number1));

    // Tests if 5 is prime using the isPrime(int a) method and prints the result on the console
    System.out.println("Is number1 prime? " + MyInteger.isPrime(5));

    // Tests if number2 is prime using the isPrime() method and prints the result on the console
    System.out.println("Is number2 prime? " + number2.isPrime());

    // Tests if number1 and 10 are equal using the equals(int a) method and prints the result on the
    // console
    System.out.println("Are number1 and number 2 equal? " + number1.equals(10));

    // Tests if number1 and number2 are equal using the equals(MyInteger a) method and prints the result on the
    // console
    System.out.println("Are number1 and number 2 equal? " + number1.equals(number2));

    // Converts list1 to a single int number using the parseInt(char[]a) and prints the result on the console
    System.out.println("The int form of char array{'1','2','3'} is " + MyInteger.parseInt(list1));

    // Converts list2 to a single int number using the parseInt(String a) and prints the result on the console
    System.out.println("The int form of string 12345 is " + MyInteger.parseInt(list2));

  }
}


/**
 * A class that contains methods to test the value of the data field valuable
 * 
 * @author edgar chang
 *
 */
class MyInteger {

  int value;

  // Declare a constructor for the class
  MyInteger(int value) {
    this.value = value;
  }

  /**
   * A method that doesn't take in parameter but return the int variable value of the class
   * 
   * @return
   */
  public int getValue() {
    return value;
  }

  /**
   * A static method that tests if the input value is even
   * 
   * @param a an input int variable that we test if it is even
   * @return a boolean result of either true or false
   */
  public static boolean isEven(int a) {
    return (a % 2 == 0);

  }

  /**
   * A method that test if the value of the object is even
   * 
   * @return a boolean result of either true or false
   */
  public boolean isEven() {
    return (this.getValue() % 2 == 0);
  }

  /**
   * A static method that tests if the value of input MyInteger object is even
   * 
   * @param a a MyInteger object that we test if its value is even
   * @return a boolean result of either true or false
   */
  public static boolean isEven(MyInteger a) {
    return (a.getValue() % 2 == 0);
  }

  /**
   * A static method that tests if the input int value is odd
   * 
   * @param a an input int variable that we test if it is odd
   * @return a boolean result of either true or false
   */
  public static boolean isOdd(int a) {
    return (a % 2 != 0);
  }

  /**
   * A method that test if the value of the object is odd
   * 
   * @return a boolean result of either true or false
   */
  public boolean isOdd() {
    return (this.getValue() % 2 != 0);
  }

  /**
   * A static method that tests if the value of input MyInteger object is odd
   * 
   * @param a a MyInteger object that we test if its value is odd
   * @return a boolean result of either true or false
   */
  public static boolean isOdd(MyInteger a) {
    return (a.getValue() % 2 != 0);
  }

  /**
   * A method that tests if the input int variable is a prime number
   * 
   * @param a an input int variable that we test if it is a prime number
   * @return a boolean result of either true or false
   */
  public static boolean isPrime(int a) {

    // Create a for loop to determine if a has a factor other than itself
    for (int i = 2; i < a; i++) {
      if (a % i == 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * A method that tests if the value of the object is a prime number
   * 
   * @return a boolean result of either true or false
   */
  public boolean isPrime() {

    // Uses isPrime(int a) method previosly declared to test if the value of the object is a prime
    // number
    return (MyInteger.isPrime(this.getValue()));

  }

  /**
   * A method that tests if the input int variable is equal to the value of the object
   * 
   * @param a an input int variable that we use to compare with the object's value
   * @return a boolean result of either true or false
   */
  public boolean equals(int a) {
    return (a == this.getValue());
  }

  /**
   * A method that tests if the input MyInteger object has the same value as the value of the object
   * being tested
   * 
   * @param a an input MyInteger object whose value we use to compare with the object's value
   * @return a boolean result of either true or false
   */
  public boolean equals(MyInteger a) {
    return (this.getValue() == a.getValue());
  }

  /**
   * A method that converts input char array into a single int number
   * 
   * @param a a char array whose entries will be merged to create the int number
   * @return y an int number created by merging the entires of the char array
   */
  public static int parseInt(char[] a) {
    // Converts the entries of the char array into a single string
    String x = new String(a);

    // Converts the string to a single int number using Integer.parseInt() method
    int y = Integer.parseInt(x);

    return y;
  }

  /**
   * A method that converts the input string variable into a single int numebr
   * 
   * @param a an input string variable
   * @return x an int number converted from the input string variable
   */
  public static int parseInt(String a) {
    // Converts the string to a single int number using Integer.parseInt() method
    int x = Integer.parseInt(a);

    return x;
  }
}

