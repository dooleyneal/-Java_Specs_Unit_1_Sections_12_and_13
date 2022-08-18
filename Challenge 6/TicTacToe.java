import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nLet's play tic tac toe");

        //Task 1: Create an array with three rows of '_' characters.
        String[][] board = {
                {"_", "_", "_"},
                {"_", "_", "_"},
                {"_", "_", "_"}
        };

        //Task 2: Call the function printBoard();
        printBorad(board);

             
              /*
              {  Task 3: Loop through turns.

                  if (X) turn {
                     Task 4: call askUser(). 
                     Task 5: populate the board using askUser's return value.
                  } else {
                      Task 4: call askUser(). 
                      Task 5: populate the board using askUser's return value. Then, print it.

                  }

                Task 6 - Call the function.
                   if return value == 3 {
                     print: X wins and break the loop
                  } else if return value == -3 {
                     print: O wins and break the loop
                  }

              } 
              */
        int X = (int)(2*Math.random()); //who goes first is random
        for (int i = 0; i < 9; i++) {

            if (X==1) {
                System.out.println("Your turn\n");
                int[] choice = askUser(board);
                board[choice[0]][choice[1]] = "X";
                X = 0;

            } else {
                System.out.println("The computer's turn\n");
                int[] choice = askComputer(board);
                board[choice[0]][choice[1]] = "O";
                X = 1;
            }
            printBorad(board);
            if (checkWin(board) == 3) {
                System.out.println("You Win!");
                break;
            }
            else if (checkWin(board) == -3) {
                System.out.println("You lose");
                break;
            }
            System.out.println("\n\n");

            if(i == 8) {
                System.out.println("Tie");
            }
        }

        scan.close();
    }


    /**
     * Task 2 - Write a function that prints the board.
     * Function name - printBoard()
     *
     * @param board (char[][])
     *              <p>
     *              Inside the function:
     *              1. print a new line.
     *              2. print the board.
     *              • separate each row by two lines.
     *              • each row precedes a tab of space
     *              • each character in the grid has one space from the other character
     */
    public static void printBorad(String[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n\n");
        }
    }

    /**
     * Task 4 - Write a function that lets the user choose a spot
     * Function name – askUser
     *
     * @param board (char[][] board)
     * @return spot (int[])
     * <p>
     * Inside the function
     * 1. Asks the user: - pick a row and column number:
     * 2. Check if the spot is taken. If so, let the user choose again.
     * 3. Return the row and column in an int[] array.
     */
    public static int[] askUser(String[][] board) {
        int row;
        int column;
        while (true) {
            System.out.println("Pick a row and column");
            row = scan.nextInt();
            scan.nextLine();
            column = scan.nextInt();
            scan.nextLine();

            if (board[row][column].equals("_")) {
                break;
            }

        }
        int[] choice = {row, column};
        return choice;
    }

    public static int[] askComputer(String[][] board) {
        int row;
        int column;
        while (true) {
            row = (int) (3 * Math.random());
            column = (int) (3 * Math.random());

            if (board[row][column].equals("_")) {
                break;
            }

        }
        int[] choice = {row, column};
        return choice;
    }


    /** Task 6 - Write a function that determines the winner
     * Function name - checkWin 
     * @param board (char[][])
     * @return count (int)
     *
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */
    public static int checkWin(String[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) { //row checks
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j].equals("X")) {
                    count++;
                }
                else if (board[i][j].equals("O")) {
                    count--;
                }
            }
            if (count == 3 || count == -3) {
                return count;
            }
            else {
                count = 0;
            }
        }

        for (int i = 0; i < board.length; i++) { //column checks
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i].equals("X")) {
                    count++;
                }
                else if (board[j][i].equals("O")) {
                    count--;
                }
            }
            if (count == 3 || count == -3) {
                return count;
            }
            else {
                count = 0;
            }
        }

        for(int i = 0; i < board.length; i++) { //main diagonal check
            if (board[i][i].equals("X")) {
                count++;
            }
            else if (board[i][i].equals("O")) {
                count--;
            }
        }
        if (count == 3 || count == -3) {
            return count;
        }
        else {
            count = 0;
        }

        for(int i = 0; i < board.length; i++) { //other diagonal check
            if(board[i][board[i].length - i - 1].equals("X")) {
                count++;
            }
            else if (board[i][board[i].length - i - 1].equals("O")) {
                count--;
            }
        }
        if (count == 3 || count == -3) {
            return count;
        }
        else {
            count = 0;
        }

        return count;

    }
}


