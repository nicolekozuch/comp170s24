public class A04 {
    public static void main(String[] args) {
        printOddCharacters("Springfield"); // Expect: p i g i l
        printEvenCharacters("Springfield"); // Expect: S r n f e d 
    } // method main

    /* 
    declare printOddCharacters() method that accepts a String as a parameter
    prints out the characters found at odd indexes
    */
    public static void printOddCharacters(String odd) {
        // for loop goes through each character in the given string
        for (int i = 0; i < odd.length(); i++) {
            if (i % 2 == 1) { // equation to find characters at odd indexes
                System.out.print(odd.charAt(i) + " ");
            }
        }
        System.out.println(); // new line places next output on separate line
    }

    /* 
    declare printEvenCharacters() method that accepts a String as a parameter
    prints out the characters found at even indexes, including zero
    */
    public static void printEvenCharacters(String even) {
        // for loop goes through each character in the given string
        for (int i = 0; i < even.length(); i++) {
            if (i % 2 == 0) { // equation to find characters at even indexes
                System.out.print(even.charAt(i) + " ");
            }
        }
        System.out.println(); // new line places next output on separate line
    }
}
