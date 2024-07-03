import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleScanning {

    static int countLines(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner sc = new Scanner(file);
        int lineCount = 0;
        while (sc.hasNextLine()) {
            lineCount++;
            sc.nextLine(); // carriage return --- move to next line in file
        }
        sc.close(); // be nice Leo
        return lineCount;
    } // method countLines

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        File file = new File("Week_07/students.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            names.add(sc.next());
            emails.add(sc.next());
        }
        System.out.println(names);
        System.out.println(emails);
    }
}