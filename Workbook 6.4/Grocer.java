import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {

        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");
        //  Task 1: Set up Scanner, and pick up the user's response.
        Scanner scan = new Scanner(System.in);
        String help = scan.nextLine();

        
        for (int i = 0; i < store.length; i++) {
            if (help.equals(store[i])) {
                System.out.println("\n We have that in aisle: " + i);
                break;
            }
          /* Task 2  
                if element equals user's response  {
                    println: \nWe have that in aisle:  <index>
                    break;
                }
          */
        }

    }
}
