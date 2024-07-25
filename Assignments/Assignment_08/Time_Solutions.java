import java.sql.Time;

public class Time_Solutions {

    /** A few useful constants with self-explanatory names */
    private static final int DEFAULT_HOUR = 0;
    private static final int DEFAULT_MINUTE = 0;
    private static final int DEFAULT_SECOND = 0;

    private static final int HOURS_IN_DAY = 24;
    private static final int MINUTES_IN_HOUR = 60;
    private static final int SECONDS_IN_MINUTE = 60;
    private static final int SECONDS_IN_HOUR = MINUTES_IN_HOUR * SECONDS_IN_MINUTE;
    private static final int SECONDS_IN_DAY = HOURS_IN_DAY * SECONDS_IN_HOUR;
    private static final int NOON = 12; // hours
    private static final int SECONDS_IN_HALF_DAY = NOON*SECONDS_IN_HOUR; // for AM/PM conversions

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
     * acceptable, rolling the clock in the opposite direction from 00:00:00.
     * 
     * @param seconds
     */
    public Time_Solutions(int seconds) {
        // The number of seconds given must never exceed the number of seconds in a full
        // day.
        int adjusted = seconds % SECONDS_IN_DAY;
        // Check for negative values
        if (adjusted < 0) {
            // Roll clock in opposite direction from 00:00:00.
            adjusted = SECONDS_IN_DAY + adjusted; // adjusted < 0 so ok to +
        }
        // Convert the int value into seconds, minutes, hour.
        this.second = adjusted % SECONDS_IN_MINUTE;
        adjusted = adjusted / SECONDS_IN_MINUTE;
        this.minute = adjusted % MINUTES_IN_HOUR;
        adjusted = adjusted / MINUTES_IN_HOUR;
        this.hour = adjusted;
    } // integer constructor

    /** Full constructor wraps to integer constructor */
    public Time_Solutions(int hour, int minute, int second) {
        this(hour * SECONDS_IN_HOUR + minute * SECONDS_IN_MINUTE + second);
    } // full constructor

    /**
     * Full constructor with AM/PM option. If the meridiem modifier is not P/p,
     * the constructor defaults to an AM time. Either way, this constructor
     * also wrap to the integer constructor.
     */
    public Time_Solutions(int hour, int minute, int second, char meridiem) {
        // First create an object given the numeri valuves
        this(hour, minute, second);
        // Then check if it's a PM time, in which case add to the object the number of
        // seconds corresponding to 12 hours.
        if (meridiem == 'p' || meridiem == 'P') {
            this.add(SECONDS_IN_HALF_DAY);
        }
    } // full constructor with AM/PM

    /** Accessors */

    public int getHour() {
        return hour;
    } // method getHour

    public int getMinute() {
        return minute;
    } // method getMinute

    public int getSecond() {
        return second;
    } // method getSecond

    /** String representation */
    public String toString() {
        String meridiem = "AM";
        int displayHour = this.hour;
        if (displayHour > NOON) {
            displayHour -= NOON;
            meridiem = "PM";
        }
        return String.format("%02d:%02d:%02d (%02d:%02d %s)",
                this.hour, this.minute, this.second, displayHour, this.minute, meridiem);
    } // method toString

    /** Integer representation */
    public int toSeconds() {
        return this.hour * SECONDS_IN_HOUR + this.minute * SECONDS_IN_MINUTE + this.second;
    } // method toSeconds()

    /** Comes handy later */
    public void copyOf(Time_Solutions other) {
        this.hour = other.getHour();
        this.minute = other.getMinute();
        this.second = other.getSecond();
    } // method copyOf

    /**
     * Adds the specified number of seconds to the present time object. For
     * illustragive purposes, the method is excessively verbose: it creates a new
     * object and then copies the new objects fields to the current object.
     */
    public void add(int addedSeconds) {
        int currentTimeInSeconds = this.toSeconds();
        int addedTime = currentTimeInSeconds + addedSeconds;
        Time_Solutions newTime = new Time_Solutions(addedTime);
        this.copyOf(newTime); /*  otherwise we'll need to use the following code:
        this.hour = newTime.getHour();
        this.minute = newTime.getMinute();
        this.second = newTime.getSecond(); */
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
        this.add(addedHours * SECONDS_IN_HOUR + addedMinutes * SECONDS_IN_MINUTE + addedSeconds);
    } // method add

    /** Subtraction is a wrapper to the corresponding add method */
    public void subtract(int subtractedSeconds) {
        this.add(-subtractedSeconds);
    } // method subtract

    /** Subtraction is a wrapper to the corresponding add method */
    public void subtract(int subtractedMinutes, int subtractedSeconds) {
        this.add(-subtractedMinutes, -subtractedSeconds);
    } // method subtract

    /** Subtraction is a wrapper to the corresponding add method */
    public void subtract(int subtractedHours, int subtractedMinutes, int subtractedSeconds) {
        this.add(-subtractedHours, -subtractedMinutes, -subtractedSeconds);
    } // method subtract

    /**
     * Converts time objects to seconds and multiply them by the given factor.
     * Negative factors result to negative seconds that can be handled by the object
     * constructor
     */
    public void multiply(int by) {
        int currentTimeInSeconds = this.toSeconds();
        int multipliedSeconds = currentTimeInSeconds * by;
        Time_Solutions newTime = new Time_Solutions(multipliedSeconds);
        this.copyOf(newTime); /*  otherwise we'll need to use the following code:
        this.hour = newTime.getHour();
        this.minute = newTime.getMinute();
        this.second = newTime.getSecond(); */
    } // method multiply

    /**
     * Converts time objects to seconds and multiply them by the given factor.
     * Negative factors result to negative seconds that can be handled by the object
     * constructor. Division by 0 is avoided by checking the value of by and when
     * == 0 we reset it to 1, therefore we treat division by 0 the same as by 1
     */
    public void divide(int by) {
        if (by == 0) {
            by = 1;
        }
        int currentTimeInSeconds = this.toSeconds();
        int dividedSeconds = currentTimeInSeconds / by;
        Time_Solutions newTime = new Time_Solutions(dividedSeconds);
        this.copyOf(newTime); /*  otherwise we'll need to use the following code:
        this.hour = newTime.getHour();
        this.minute = newTime.getMinute();
        this.second = newTime.getSecond(); */
    } // method divide

    
} // class time_solutions