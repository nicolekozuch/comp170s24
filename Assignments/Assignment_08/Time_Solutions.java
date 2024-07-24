public class Time_Solutions {

    /** A few useful constants with self-explanatory names */
    private static final int DEFAULT_HOUR = 0;
    private static final int DEFAULT_MINUTE = 0;
    private static final int DEFAULT_SECOND = 0;

    private static final int HOURS_IN_DAY = 24;
    private static final int MINUTES_IN_HOUR = 60;
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int SECONDS_IN_HOUR = MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
    private static final int AFTERNOON = 12; // for AM/PM conversions

    /** Object fields */
    private int hour;
    private int minute;
    private int second;

    /** Default constructor */
    public Time_Solutions() {
        this.hour = DEFAULT_HOUR;
        this.minute = DEFAULT_MINUTE;
        this.second = DEFAULT_SECOND;
    } // default constructor

    /**
     * Integer constructor. Accepts any integer value and coverts it into an hour,
     * minute, and second triad. If the value exceeds the number of seconds in a
     * day, it is wrapped around using modulo arithmetic. Negative values are also
     * acceptable.
     * 
     * @param seconds
     */
    public Time_Solutions(int seconds) {
        int adjusted = seconds % SECONDS_IN_DAY;
        if (adjusted < 0) {
            adjusted = SECONDS_IN_DAY + adjusted; // adjusted < 0 so ok to +
        }
        this.second = adjusted % SECONDS_IN_MINUTE;
        adjusted = adjusted / SECONDS_IN_MINUTE;
        this.minute = adjusted % MINUTES_IN_HOUR;
        adjusted = adjusted / MINUTES_IN_HOUR;
        this.hour = adjusted;
    } // integer constructor

    /** Full constructor */
    public Time_Solutions(int hour, int minute, int second) {
        this(hour * SECONDS_IN_HOUR + minute * SECONDS_IN_MINUTE + second);
    } // full constructor

    /**
     * Full constructor with AM/PM option. If the meridiem modifier is not P/p,
     * the constructor defaults to an AM time
     */
    public Time_Solutions(int hour, int minute, int second, char meridiem) {
        this((hour + ((meridiem == 'p' || meridiem == 'P' ? AFTERNOON : 0))) * SECONDS_IN_HOUR
                + minute * SECONDS_IN_MINUTE + second);
    } // full constructor AM/PM

    /**
     * Adds the specified number of seconds to the present time object. For
     * illustragive purposes, the method is excessively verbose: it creates a new
     * object and then copies the new objects fields to the current object.
     */
    public void add(int addedSeconds) {
        int currentTimeInSeconds = this.hour * SECONDS_IN_HOUR + this.minute * SECONDS_IN_MINUTE + this.second;
        int addedTime = currentTimeInSeconds + addedSeconds;
        Time_Solutions newTime = new Time_Solutions(addedTime);
        this.hour = newTime.hour;
        this.minute = newTime.minute;
        this.second = newTime.second;
    } // method add

    /**
     * Overloaded method converts specified minutes and seconds into seconds, calls
     * principal add method.
     */
    public void add(int addedMinutes, int addedSeconds) {
        this.add(addedMinutes * SECONDS_IN_MINUTE + addedSeconds);
    } // method add

    /**
     * Overloaded method converts specified hours, minutes and seconds into 
     * seconds, calls principal add method.
     */
    public void add(int addedHours, int addedMinutes, int addedSeconds) {
        this.add(addedHours*SECONDS_IN_HOUR+addedMinutes+SECONDS_IN_MINUTE+addedSeconds);
    } // method add

    /** String representation */
    public String toString() {
        return String.format("%02d:%02d:%02d",
                this.hour, this.minute, this.second);
    } // method toString

} // class time_solutions