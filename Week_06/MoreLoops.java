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
}
