import java.io.File;
import java.util.Scanner;

public class SophisticatedScanning {

    public static Scanner connectToFile(String filename) {
        Scanner sc;
        try {
            File file = new File(filename);
            sc = new Scanner(file);
        } catch (Exception e) {
            sc = null;
        }
        return sc;
    }

    public static int countLines(String filename) {
        int lineCount = -1;
        Scanner sc = connectToFile(filename);
        if (sc != null) {
            lineCount = 0;
            while (sc.hasNextLine()) {
                lineCount++;
                sc.nextLine();
            }
            sc.close(); // beeing nice
        }
        return lineCount;
    }

    public static void main(String[] args) {
        String filename = "Week_007/students.txt";
        System.out.printf("\nFile %s has %d line(s)\n\n\n",
        filename, countLines(filename));
    }

}