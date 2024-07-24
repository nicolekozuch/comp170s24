public class Car {

    private static final String DEFAULT_COLOR = "white";
    private static final boolean DEFAULT_IS_AUTOMATIC = true;
    private static final String DEFAULT_MODEL = "*** MODEL NOT SPECIFIED ***";
    private static final String DEFAULT_MAKE = "*** MAKE NOT SPECIFIED ***";
    private static final int DEFAULT_YEAR = 2020;
    
    private String color; // defaults to white
    private String make;  // null or constructor
    private String model; // null of constructor
    private boolean isAutomatic; // defaults to true;
    private int year; 
 
    /** Basic constructor (for non defaulted attributes */
    public Car(String make, String model) {
        this(DEFAULT_COLOR, make, model, DEFAULT_IS_AUTOMATIC, DEFAULT_YEAR);
    }

    /** Full constructor */
    public Car(String color, String make, String model, boolean isAutomatic, int year) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.isAutomatic = isAutomatic;
        this.year = year;
    }

    /** Default constructor -- no arguments */ 
    public Car() {
        this(DEFAULT_COLOR, DEFAULT_MAKE, DEFAULT_MODEL, DEFAULT_IS_AUTOMATIC, DEFAULT_YEAR);
    }

    /** String representation */
    public String toString() {
        String transmission;
        if (this.isAutomatic) {
            transmission = "automatic";
        } else {
            transmission = "manual";
        }
        return String.format("This is a %s %s %s %s", this.color, transmission, this.make, this.model);
    }

    /** Age comparison */
    public int compareTo(Car other) {
        return other.year-this.year;
    }

    /** Determine equality */
    public boolean equals(Car other) {
        return this.compareTo(other) == 0 && this.color.equals(other.color);
    }
}
