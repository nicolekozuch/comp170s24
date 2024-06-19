public class Numbers {
    public static void printNumbers(int upTo) {
        //for (int i = 0; i < upTo; i++) { // i++ is shortcut to i=i+1
        //    System.out.println(i);
        //}
        printNumbers(0, upTo, 1);
    } // method printNumbers

    public static void printNumbers(int from, int upTo) {
        //for (int i = from; i < upTo; i++) {
        //    System.out.println(i);
        //}
        printNumbers(from, upTo, 1);
    }

    public static void printNumbers(int from, int upTo, int step) {
        for (int i = from; i < upTo; i = i+step) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        printNumbers(5);
        printNumbers(6,10);
        printNumbers(10, 100, 10);
    }
}