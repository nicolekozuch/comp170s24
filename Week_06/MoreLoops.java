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
     * Tell if a given string is a word or not.
     * 
     * @param string String to evaluate
     * @return true if string contains only letters, false otherwise including
     * null and empty strings.
     */
    static boolean isWord(String string) {
        boolean possiblyAWord = false;
        if (string.length() > 0 && string != null) {
            possiblyAWord = true;
            int position = 0;
            while (possiblyAWord && position < string.length()) {
                char current = string.charAt(position);
                if (current < 'A' || 
                    current > 'z' || 
                    (current > 'Z' && current < 'a')) {
                        possiblyAWord = false;
                }
                position++;
            }
        }
        return possiblyAWord;
    }
}
