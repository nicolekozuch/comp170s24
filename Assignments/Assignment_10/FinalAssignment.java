import java.util.Arrays; // only importing to use Arrays.toString method for array String representation

public class FinalAssignment {
    public static void main(String[] args) {
        /* Testing the merge method */
        int[] a = {7, 11, 21, 44}; 
        int[] b = {4, 13, 20, 64, 86};
        int[] c = merge(a, b); 
        System.out.println("PROBLEM 1\nMerged array: " + Arrays.toString(c));

        /* Testing the reverse method */
        System.out.println("\nPROBLEM 2");
        System.out.println(reverse("Today is August 7th, 2024, the 'final' day of class."));

        /* Testing the simple sorting method */
        int[] A = {90, 83, 12, 75, 60, 50};
        int[] B = simpleSort(A);
        System.out.println("\nPROBLEM 3\nSorted array: " + Arrays.toString(B));
    }

    /*
     * Merges two pre-sorted arrays into one sorted array, in ascending order
     * 
     * @param int[] left array, the first array
     * @param int[] right array, the second array
     * @return the final sorted ascending array
     */
    public static int[] merge(int[] left, int[] right) {
        // iniitializing index variables to 0, to begin from the start
        int leftIndex = 0;
        int rightIndex = 0;
        int mergedIndex = 0;

        // initializing length variables for array lengths, cleaner look
        int leftLength = left.length;
        int rightLength = right.length;

        // initialize new merged array using both left and right lengths as one new length
        int[] mergedArray = new int[leftLength + rightLength];

        // checks both the left and right arrays to not be empty or null
        if (leftLength != 0 || left != null || rightLength != 0 || right != null) {
            // loops through both arrays, merging into new array until either array ends
            while (leftIndex < leftLength && rightIndex < rightLength) {
                // checks for which element comes next in mergedArray
                if (left[leftIndex] <= right[rightIndex]) {
                    mergedArray[mergedIndex++] = left[leftIndex++]; // places element from left array into new array
                } else {
                    mergedArray[mergedIndex++] = right[rightIndex++]; // places element from right array into new array
                }
            }
    
            // adds the remaining elements from left array into new array
            while (leftIndex < leftLength) {
                mergedArray[mergedIndex++] = left[leftIndex++];
            }
    
            // adds the remaining elements from right array into new array
            while (rightIndex < rightLength) {
                mergedArray[mergedIndex++] = right[rightIndex++];
            }
        }
        return mergedArray;
    }

    /* 
     * Reverses a string
     * 
     * @param the string to be reversed
     * @return reversed string
     */
    public static String reverse(String string) {
        String reversed = ""; // initialize an empty string
        // checks for empty or null strings 
        if (string != "" || string != null) {
            // begins at the end of the string until ending at the first character of the string
            for (int i = string.length() - 1; i >= 0; i--) {
                reversed += string.charAt(i); // adds each character to the new string
            }
        }
        return reversed;
    }

    /*
     * Sorts through an array in ascending order
     * 
     * @param int[] array to be sorted
     * @return the array in ascending order
     */
    public static int[] simpleSort(int[] array) {
        int n = array.length; // initialize variable for length of array
        // checks for empty or null arrays 
        if (array.length != 0 || array != null) {
            // iterates through array
            for (int i = 0; i < n - 1; i++) {
                // iterates through array starting at a second value to compare two elements
                for (int j = 0; j < n - i - 1; j++) {
                    // checks if element is the smallest value
                    if (array[j] > array[j + 1]) {
                        int temp = array[j]; // assigns variable to element at specified index
                        array[j] = array[j + 1]; 
                        array[j + 1] = temp; // swaps the values if they are out of order
                    }
                }
            }
        }
        return array;
    }
}