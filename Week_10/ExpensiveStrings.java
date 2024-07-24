public class ExpensiveStrings {
    public static void main(String[] args) {
        String name = "Leo";
        for(int i = 0; i < 10; i++) {
            System.err.println(name);
            name = name + " " + i;
        }
    }
}
