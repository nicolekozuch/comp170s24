import java.io.FileNotFoundException;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class A06 {
    public static void main(String[] args) {
        Random rand = new Random();
        // Get a random number between 0 and 99
        int randomNumber = rand.nextInt(100);
        // Connect a scanner to the keyboard
        Scanner sc = new Scanner(System.in);
        /**********************************************************************
         *                       WRITE YOUR CODE HERE                         *
         *********************************************************************/
        // Close the scanner
        sc.close(); 
    } // method main
}
