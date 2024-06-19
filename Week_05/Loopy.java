public class Loopy {

    public static void main(String[] args) {
        reversePrintCharacters("Springfield");

    }

/**
 * Prints the characters of a string one at a time, reporting their 
 * position.
 * 
 * @param string String to parse
 */
    static void printCharacters(String string) {
        // Loop to traverse the entire string from its first character
        // at position 0 until its last character at length-1.
        for (int position = 0; position < string.length(); position = position+1) {
            char current = string.charAt(position);
            System.out.printf("\nAt position %2d the character is %s", position, current);
        }
        System.out.println();
    } // method printCharacters

/**
 * Print the characters of a string in reverse order and 
 * report their position.
 * 
 * @param string String to parse
 */
    static void reversePrintCharacters(String string) {
        // Loop starts from the last character of the string (at position
        // string.length-1 and stops after arriving at the first character
        // at position 0. The position value decreases by 1, each round)
        for (int position = string.length()-1; position >= 0; position = position -1 ) {
            char current = string.charAt(position);
            System.out.printf("\nAt position %2d the character is %s", position, current);
        }
        System.out.println();
    } // method reversePrintCharacters

}