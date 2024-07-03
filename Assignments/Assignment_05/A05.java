public class A05 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("racecar")); // expect true;
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // expect true
        System.out.println(isPalindrome("Java")); // expect false
    } // method main

    /**
     * Determines if a string is a palindrome or not. This is done by comparing
     * pairs of characters from symmetric positions from both ends of the
     * string. Here're two examples:
     * 
     * <pre>
     *   r    a    c    e    c    a    r              t    a    r    t
     *   |    |    |         |    |    |              |    |    |    |   
     *   |    |    +- match -+    |    |              |    +-no-+    |
     *   |    +------ match ------+    |              +--- match ----+
     *   +----------- match -----------+
     * </pre>
     * 
     * @param string String to test for palindrome
     * @return true if string is palindrome, false otherwise or if string is null.
     *         Empty strings and single character strings are by default
     *         palindromes.
     */
    static boolean isPalindrome(String string) {
        // Guard statement against null inputs
        if (string == null) {
            return false; // nulls cannot be palindromes
        }
        // Strip string of any non-letter characters and convert to same case
        // I like uppercase conversions!
        String tester = keepLettersOnly(string).toUpperCase();
        // Guard statement for empty or single-character strings
        if (tester.length() == 0 || tester.length() == 1) {
            return true; // palindrome by default
        }
        // Explore everything else in pairwise matches, assuming that the
        // string is a palindrome to begin with, declare it non-palindrome
        // as soon as we find a non-matching pair.
        boolean pali = true;
        // Prepare to test every pair of characters from both ends
        int i = 0;
        // Since we are traversing the string from both ends, we only need
        // to run up to its middle
        while (pali && i < tester.length() / 2) {
            // Verify that the current pair matches. The moment we find a
            // mismatch, pali turns false, the loop ends, and we return that
            // false.
            pali = tester.charAt(i) == tester.charAt(tester.length() - 1 - i);
            i++;
        }
        return pali;
    } // method isPalindrome

    /**
     * Removes all non-letter characters from a string and returns its letters
     * only. For example, "Hello World!" becomes "HelloWorld". This way a
     * string like "A man, a plan, a canal: Panama" that does not appear to
     * be a palindrome, becomes "AmanaplanacanalPanama" which, when converted
     * to the same case, e.g., "AMANAPLANACANALPANAMA" is a palindrome.
     * 
     * @param string String to strip non-letter characters from
     * @return String with letter symbols only, or empty if input string
     *         is null or empty itself.
     */
    static String keepLettersOnly(String string) {
        // Return variable
        String lettersOnly = new String("");
        // Ensure string not null. If it is null, we'll return an empty string
        if (string != null) {
            for (int i = 0; i < string.length(); i++) {
                char curr = string.charAt(i);
                // Verify that curr is an upper or lower case letter:
                if ((curr >= 'A' && curr <= 'Z') || (curr >= 'a' && curr <= 'z')) {
                    // Add this letter to the string we are returning
                    lettersOnly = lettersOnly + curr;
                }
            }
        }
        return lettersOnly;
    } // method keepLettersOnly

}
