public class Person {

    private String firstName;
    private String lastName;
    private int bdayDay;
    private int bdayMonth;
    private String gender;
    private String email;
    private String tiktokHandle;
    private int phoneNumber;

    /** String representation for this object */
    public String toString() {
        return "first name: " + firstName +
                "\nlast name: " + lastName +
                "\nemail: " + email;
    }
}
