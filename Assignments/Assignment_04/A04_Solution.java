public class A04_Solution {
    public static void main(String[] args) {
        printOddCharacters("Springfield"); // Expect: p i g i l
        printEvenCharacters("Springfield"); // Expect: S r n f e d 
        printEvenCharacters(null);
        printOddCharacters("");
    } // method main

    static void printOddCharacters(String string) {
        if (string != null && string.length() > 0) {
            for (int i = 0; i < string.length(); i = i+2) {
                System.out.print(string.charAt(i)+" ");
            }
            System.out.println();
        } else {
            System.out.println(">> Nothing to print <<");
        }
    } // method printOddCharacters

    static void printEvenCharacters(String string) {
        if (string != null && string.length() > 0) {
            for (int i = 1; i < string.length(); i = i+2) {
                System.out.print(string.charAt(i)+" ");
            }
            System.out.println();
        } else {
            System.out.println(">> Nothing to print <<");
        }
    } // method printEvenCharacters

}