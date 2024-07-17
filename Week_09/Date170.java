public class Date170 {

    private static final int DEFAULT_YEAR = 1993;
    private static final int DEFAULT_MONTH = 5;
    private static final int DEFAULT_DAY = 23;


    private int year;
    private int month;
    private int day;

    /** Default constructor */
    public Date170() {
        this.year = DEFAULT_YEAR;
        this.month = DEFAULT_MONTH;
        this.day = DEFAULT_DAY;
    } // default constructor

    /**
     * This is the full constructor for this object. The constructor validates
     * parameters and if they are not within range, it resets them to the object's
     * default value.
     * 
     * @param year  int with year value
     * @param month int with month value (must be 1-12 inclusive; otherwise defaults to 5)
     * @param day   int with day value
     */
    public Date170(int year, int month, int day) {
        // Simple rule to validate month
        if (month < 1 || month > 12) {
            month = DEFAULT_MONTH;
        }
        // Validate Feb 29 - if month = 2 and day = 29 then year must be leap
        // Leap year: divisible by 4, except if divisible by 100 but not by 400.
        // Also remembere months with 31 days.
        // Thirty days has September, 
        // April, June, and November,
        // All the rest have thirty-one,
        // Save February at twenty-eight,
        // But leap year, coming once in four,
        // February then has one day more.
        if ((month == 4 || month == 6 || month ==9 || month == 11 ) && day == 31) {
            day = 30;
        }
        this.year = year;
        this.month = month;
        this.day = day;
    } // full constructor

    public String toString() {
        return String.format("%04d-%02d-%02d",
                this.year, this.month, this.day);
    }
}
