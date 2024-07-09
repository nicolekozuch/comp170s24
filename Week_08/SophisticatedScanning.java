import java.io.File;
import java.util.Scanner;

/**
 * A program to demonstrate graceful handling of errors when trying to
 * scan a file.
 */
public class SophisticatedScanning {

    private static final String ERROR_MESSAGE = "\nFile %s not available\n\n";
    private static final String REPORT_MESSAGE = "\nFile %s has %d line(s)\n\n";

    /**
     * This method establishes a scanner connection to a specified file.
     * Instead of throwing a FileNotFoundException, the method returns
     * a null when the connection cannot be established. It is up to the
     * users of this method to determine how to handle the situation.
     * 
     * @param filename String with filepath to file that we want to scan
     * @return Scanner object connected to the specified file or null if connection
     *         not possible.
     */
    public static Scanner connectToFile(String filename) {
        // Declare a scanner variable. Its actual value will be assigned
        // by the try/catch block.
        Scanner sc;
        // The try/catch block will try to instantiate a scanner for the
        // specified file. If the connection is possible, the scanner
        // variable will be assigned with a value identifying the
        // scanner instance to the specified file.
        try {
            // Execute this code and if no errors occur during execution
            // skil past the try/catch scope. But if an error occurs,
            // execute onluy the code in the catch block.
            File file = new File(filename);
            sc = new Scanner(file);
        } catch (Exception e) {
            // If anything goes wrong int the try block above, just
            // execute this block and exit the try/catch scope.
            sc = null;
        }
        // At this point, one of the two blocks of the try/catch scope
        // above has executed. As a result there is a value assigned
        // to the return variable. If something went wrong that value
        // is null; otherwise, it's a scanner connected to the specified file.
        return sc;
    } // method connectToFile

    /**
     * Counts the lines in a specified file. If the file cannot be found
     * the method returns -1 instead of throwing an exception, allowing
     * its users how to handle the situation.
     * 
     * @param filename String with filepath to file that we want to scan
     * @return int value with number of lines in the specified file or -1 is
     *         something goes wrong and we cannot connect to that file.
     */
    public static int countLines(String filename) {
        // Initialize the return value to -1
        int lineCount = -1;
        // Use method connectToFile to establish a scanner connection to the specified
        // file. The method returns a null when the connections is not possible. In that
        // case we skip the if-block and return the default value -1.
        Scanner sc = connectToFile(filename);
        if (sc != null) {
            // Connection was possible; reset the lineCount value to 0 and
            // start counting lines until we reach the end of file.
            lineCount = 0;
            while (sc.hasNextLine()) {
                lineCount++;
                sc.nextLine();
            }
            // Be nice and close the scanner when done using it.
            sc.close();
        }
        // At the end of the if-block the value of lineCount is either -1 because we
        // never executed the if block (scanner sc was null) or some value >-1
        // representing the actual number of lines in the specified file.
        return lineCount;
    } // method countLines

    /**
     * Displays information about a file, specifically the number of lines in it.
     * 
     * @param filename String path to file name to analyze.
     */
    public static void reportLineCount(String filename) {
        // Number of lines is obtained from method countLines; if something goes wrong
        // the reported number will be -1
        int lineCount = countLines(filename);
        if (lineCount == -1) {
            // Something went wrong; inform the user
            System.out.printf(ERROR_MESSAGE, filename);
        } else {
            // Report information obtained about the file.
            System.out.printf(REPORT_MESSAGE, filename, lineCount);
        }
    } // method reportLineCount

    /** Driver code */
    public static void main(String[] args) {
        String wrongFilename = "Week_98/UX8qw114.txt"; // fictitious file
        String rightFilename = "Week_08/students.txt"; // existing file
        reportLineCount(wrongFilename);
        reportLineCount(rightFilename);
    } // method main

} // class SophisticatedScanning