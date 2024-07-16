public class Contacts {
    public static void main(String[] args) {
        Person f1 = new Person();
        f1.firstName = "Kendall";
        f1.bdayMonth = 10;
        f1.lastName = "Savino";
        f1.email = "kendall@luc.edu";

        Person f2 = new Person();
        f2.firstName = "Ian";
        f2.bdayMonth = 5;

        System.out.println(f1);
        System.out.println(f2);
      }
}
