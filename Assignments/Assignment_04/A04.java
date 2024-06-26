public class A04 {
    public static void main(String[] args) {
        printOddCharacters("Springfield"); // Expect: p i g i l
        printEvenCharacters("Springfield"); // Expect: S r n f e d 
    } // method main

    // declare printOddCharacters() method
    public static void printOddCharacters(String odd) {
        System.out.println(); // stylistic choice
        char oddChar;
        for (int i = 0; i < odd.length(); i++) {
            if (i % 2 != 0) {
                oddChar = odd.charAt(i);
                System.out.print(oddChar + " ");
            }
        }
        System.out.println();
    }

    // declare printEvenCharacters() method
    public static void printEvenCharacters(String even) {
        char evenChar;
        for (int i = 0; i < even.length(); i++) {
            if (i % 2 == 0) {
                evenChar = even.charAt(i);
                System.out.print(evenChar + " ");
            }
        }
        System.out.println("\n"); // stylistic choice
    }
}
