package ca.mcgill.ecse202.a4;

import java.util.Scanner;

public class Question1 {

  public static void main(String[] args) {
    // Creates new scanner object
    Scanner input = new Scanner(System.in);
    // Makes the outline of the board by declaring a two dimensional String array filled with
    // appropriate signs
    String[][] board = new String[7][13];
    for (int x = 0; x < 7; x++) {
      for (int y = 0; y < 13; y++) {
        // Fills even rows and zero row with hyphen sign
        if (x % 2 == 0 || x == 0) {
          board[x][y] = "-";
        } else {
          // Fills odd rows with | every interalval of four columns
          if (y % 4 == 0) {
            board[x][y] = "|";
          } else {
            board[x][y] = " ";
          }
        }
      }
    }
    // Declares a boolean variable to control the continuance of the game
    boolean status = false;

    // Declares an integer to control the alternation between player X and player O
    int a = 1;

    // Creates a while loop to start the game
    while (status == false) {

      // When a is odd, it is player X's turn
      if (a % 2 == 1) {

        // Prompts the user to enter row and column number and store them in int variables
        System.out.println("Enter a row for player X: ");
        int xrow = input.nextInt();
        System.out.println("Enter a column for player X: ");
        int xcolumn = input.nextInt();

        // Assigns the letter X to the corresponding grid, only if the grid is empty
        if (board[(xrow * 2) + 1][(xcolumn * 4) + 2] == " ") {
          board[(xrow * 2) + 1][(xcolumn * 4) + 2] = "X";
        }

        else {
          // Prompts the user to enter another row and column if the grid is occupied
          System.out.println("Choose another box!");
          continue;
        }

        // Increases a by 1 every time to alternate between two players
        a++;

        // Prints the board along with the input from the user
        printBoard(board);

        // Checks if the player wins in either row, column or diagonal
        status = checkRowWin("X", board, status);
        status = checkColumnWin("X", board, status);
        status = checkDiagonalWin("X", board, status);
      }

      else {
        // Prompts the user to enter row and column number and store them in int variables
        System.out.println("Enter a row for player O: ");
        int orow = input.nextInt();
        System.out.println("Enter a column for player O: ");
        int ocolumn = input.nextInt();

        // Assigns the letter X to the corresponding grid, only if the grid is empty
        if (board[(orow * 2) + 1][(ocolumn * 4) + 2] == " ") {
          board[(orow * 2) + 1][(ocolumn * 4) + 2] = "O";
        }

        else {
          System.out.println("Choose another box!");
          continue;
        }
        // Increases a by 1 every time to alternate between two players
        a++;

        // Increases a by 1 every time to alternate between two players
        printBoard(board);

        // Checks if the player wins in either row, column or diagonal
        status = checkRowWin("O", board, status);
        status = checkColumnWin("O", board, status);
        status = checkDiagonalWin("O", board, status);

      }
      // Exits the game if the boolean variable status has been changed to true by the checkwin
      // methods
      if (status == true) {
        break;
      }
      // Checks if it is a draw
      status = checkDraw(board, status);
    }
  }

  /**
   * A method that checks if the board has a same successive mark through a row
   * 
   * @param O, the String variable that the method checks if it appears through out a row
   * @param p, the two dimensional arrays that acts as the "board" with player inputs stored within
   * @param star, the boolean variable that controls the continuance of the game
   * @return star, the boolean variable that is changed in winning situation, or unchanged otherwise
   */
  public static boolean checkRowWin(String O, String[][] p, boolean star) {
    // Declares a nested for loop to move horizontally through the arrays
    for (int x = 1; x < p.length; x += 2) {

      // Declares an int variable to count the appearance of the target String character
      int countRow = 0;
      for (int y = 2; y < p[x].length; y += 4) {
        // Increases countRow by 1 if the String character in the grid matches the target
        if (p[x][y] == O) {
          countRow++;
        }
      }

      if (countRow == 3) {
        // Changes star to true if a row win is detected
        star = true;
        // Prints the message of winning on the console
        System.out.println(O + " player won");
      }
    }
    // Returns the boolean variable star
    return star;
  }

  /**
   * A method that checks if the board has a same successive mark through a column
   * 
   * @param O, the String variable that the method checks if it appears through out a column
   * @param p, the two dimensional arrays that acts as the "board" with player inputs stared within
   * @param star, the boolean variable that controls the continuance of the game
   * @return star, the boolean variable that is changed in winning situation, or unchanged otherwise
   */
  public static boolean checkColumnWin(String O, String[][] p, boolean star) {

    // Declares a nested for loop to move vertically through the arrays
    for (int x = 2; x < p[0].length; x += 4) {

      // Declares an int variable to count the appearance of the target String character
      int countColumn = 0;
      for (int y = 1; y < p.length; y += 2) {
        if (p[y][x] == O) {
          // Increases countColumn by 1 if the String character in the grid matches the target
          countColumn++;
        }
      }

      if (countColumn == 3) {
        // Changes star to true if a column win is detected
        star = true;
        // Prints the message of winning on the console
        System.out.println(O + " player won");
      }
    }
    // Returns the boolean variable star
    return star;
  }

  /**
   * A method that checks if the board has a same successive mark through a diagonal line
   * 
   * @param O, the String variable that the method checks if it appears through out a column
   * @param p, the two dimensional arrays that acts as the "board" with player inputs stared within
   * @param star, the boolean variable that controls the continuance of the game
   * @return star, the boolean variable that is changed in winning situation, or unchanged otherwise
   */
  public static boolean checkDiagonalWin(String O, String[][] p, boolean star) {

    // Declares an int variable to count the appearance of the target String character
    int countDiagonal = 0;

    // Creates a for loop to move diagonally from left to right through the array
    for (int x = 1, y = 2; x < p.length && y < p[x].length; x += 2, y += 4) {
      if (p[x][y] == O) {
        // Increases countDiagonal by 1 if the String character in the grid matches the target
        countDiagonal++;
      }
    }

    if (countDiagonal == 3) {
      // Changes star to true if a diagonal win is detected
      star = true;
      // Prints the message of winning on the console
      System.out.println(O + " player won");
    }

    // Resets the value of countDiagonal
    countDiagonal = 0;

    // Creates a for loop to move diagonally from right to left through the array
    for (int x = 1, y = 10; x > 0; y += 2, x -= 4) {
      if (p[x][y] == O) {
        // Increases countDiagonal by 1 if the String character in the grid matches the target
        countDiagonal++;
      }
    }
    if (countDiagonal == 3) {
      // Changes star to true if a diagonal win is detected
      star = true;
      // Prints the message of winning on the console
      System.out.println(O + " player won");
    }
    // Returns the boolean variable star
    return star;
  }

 /** A method that checks for draw situation, in which all grids have been filled but no winner has been announced
 * @param p, the two dimensional String array that acts as the "board" with player inputs stared within
 * @param star, the boolean variable that controls the continuance of the game
 * @return star, the boolean variable that is changed in draw situation, or unchanged otherwise
 */  
  public static boolean checkDraw(String[][] p, boolean star) {
    // Declares an int variable to count the occupied cell
    int countCell = 0;
    
    // Creates a nested for loop to move through the arrays and check each grid for occupancy
    for (int x = 1; x < p.length; x += 2) {
      for (int y = 2; y < p[x].length; y += 4) {
        if (p[x][y] != " ") {
          // Increases countCell by one if the grid is occupied
          countCell++;
        }
      }

    }
    if (countCell == 9) {
      // Changes star to true if all grids are occupied
      star = true;
      // Prints the message "Draw" on the console
      System.out.println("Draw");
    }
    // Returns the boolean variable star
    return star;
  }

  /** A method that prints the outline of the tictactoe board
   * @param plate, the two dimensional arrays that store the marking of the board
   */
  public static void printBoard(String[][] plate) {
    // Creates a nested for loop that prints each element in the array plate
    for (int x = 0; x < 7; x++) {
      for (int y = 0; y < 13; y++) {
        System.out.print(plate[x][y]);
      }
      // Jumps to next line after each row
      System.out.println();
    }
  }
}

