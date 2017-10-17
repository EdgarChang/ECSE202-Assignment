package ca.mcgill.ecse202.a6;

import java.util.Scanner;

public class Question2 {

  public static void main(String[] args) {

    // Creates a Scanner object
    Scanner input = new Scanner(System.in);

    // Prompts user to enter a time as hour minute and second
    System.out.println("Enter time1 (hour minute second) : ");

    // Creates int variables to store user inputs
    int hour = input.nextInt();
    int minute = input.nextInt();
    int second = input.nextInt();

    // Creates a Time object
    Time time1 = new Time(hour, minute, second);

    // Prints out time as a string
    System.out.println(time1.toString());

    // Prints out elapsed seconds
    System.out.println("Elapsed seconds in time1: " + time1.getSeconds());

    // Prompts user to enter a time in second
    System.out.println("\nEnter time2 (elapsed time) : ");

    // Creates int variable to store user input
    int time = 1000 * input.nextInt();

    // Creates a Time object
    Time time2 = new Time(time);

    // Prints out time as a String
    System.out.println(time2.toString());

    // Prints out elapsed seconds in time2
    System.out.println("Elapsed seconds in time2: " + time2.getSeconds());

    // Prints out the comparison of time1 and time2
    System.out.println("\ntime1.compareTo(time2)? " + time1.compareTo(time2));

    // Creates time3 as a clone of time1
    Time time3 = time1.clone();

    // Prints the comparison of time1 to time3 on console
    System.out.println("\ntime3 is created as a clone of time1");
    System.out.println("time1.compareTo(time3)? " + time1.compareTo(time3));


  }
}

/**
 * A class implementing Comparable and Cloneable interfaces that displays time in hour , minute, and
 * seconds and compare two different times
 * 
 * @author edgarchang
 */
class Time implements Comparable<Time>, Cloneable {

  // Declares a long data field for the class
  long totalmiliseconds = System.currentTimeMillis();

  // No-arg constructor for time
  public Time() {};

  // A constructor for time with three int parameters
  public Time(int hour, int minute, int second) {
    this.totalmiliseconds = (hour * 60 * 60 * 1000) + (minute * 60 * 1000) + (second * 1000);
  }

  // A constructor for specified time starting in 1970
  public Time(long time) {
    this.totalmiliseconds = time;
  }

  // A method that returns a clone of a Time object
  public Time clone() {
    try {
      return (Time) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
      throw new RuntimeException();
    }
  }

  /**
   * A method that calculates current hour
   * 
   * @return current hour between 0 and 23
   */
  public int getHour() {
    return (int) ((totalmiliseconds / (1000 * 60 * 60)) % 24);
  }

  /**
   * A method that calculates current minute
   * 
   * @return current minute between 0 and 59
   */
  public int getMinute() {
    return (int) (totalmiliseconds / 1000 / 60 % 60);
  }

  /**
   * A method that calculates current second
   * 
   * @return current second between 0 and 59
   */
  public int getSecond() {
    return (int) (totalmiliseconds / 1000 % 60);
  }

  /**
   * A method that returns total seconds elapsed since 1970
   * 
   * @return total elapsed seconds
   */
  public int getSeconds() {
    return (int) (totalmiliseconds / 1000);
  }

  /**
   * A method that shows the current time in String
   * 
   * @return a String showing time in the format of hour, minute, and second
   */
  public String toString() {
    return (getHour() + " hours " + getMinute() + " minutes " + getSecond() + (" seconds"));
  }

  /**
   * A method that compares the elapsed seconds of two Time objects
   * 
   * @return the difference between two Time object in second
   */
  @Override
  public int compareTo(Time time) {
    return (getSeconds() - time.getSeconds());
  }
}
