import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleScanning {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Week_07/students.md");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String name = scanner.next();
            String email = scanner.next();
            System.out.println("Name: "+name+", email: " + email);
        }
        scanner.close();
    }
}