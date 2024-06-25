public class MoreLoops {
    public static void main(String[] args) {
        String test = "hippopotamus";
        char targetLetter = 'H';
        int counterValue = countLetters(test, targetLetter);
        System.out.printf("\n\nThe number of times the letter %s appears in %s is: %d\n\n",
                          targetLetter, test, counterValue);
    }

    static int countLetters(String word, char letter) {
        int counter = 0; // Counter variable
        for (int i = 0; i < word.length(); i++) { // Go through every position in string word
            if (word.charAt(i) == letter) { // current character in word matches target letter
                counter++; // increase count of letter by 1
            }
        }
        return counter;
    }

    /**
     * Tell if a given string is a word or not
     */
    static boolean isWord(String string) {
        int ascii_A = (int) 'A';
        int ascii_a = (int) 'a';
        int ascii_Z = (int) 'Z';
        int ascii_z = (int) 'z';
        boolean result = false;
        if (string != null && string.length() > 0) {
            // check out its contents one character at a time, ensuring that
            // each and every character is a letter, A-Z or a-z
            int position = 0;
            result = true;
            while (position < string.length() && result) {
                // The moment I find a non letter character, change result to false and
                // end the loop. When a character is NOT a letter
                int current = (int) string.charAt(position); // ASCII of current character
                if (current < ascii_A) { result = false; } // less than A
                if (current > ascii_z) { result = false; } // more than z
                if (ascii_Z < current && current < ascii_a) { result = false; } // between Z-a
            }
        }
        return result;
    }
}
