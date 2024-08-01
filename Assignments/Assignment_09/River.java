
public class River {

    private static final int DEFAULT_LENGTH = -1;
    private static final int DEFAULT_WIDTH = -1;
    private static final String DEFAULT_MEASURE_UNIT = "miles";
    private static final boolean DEFAULT_WATERFALLS = false;
    private static final String DEFAULT_ORIGIN = "Tatooine";
    private static final String NULL_RIVER = ">> no data available <<";
    private static final String INFO_UNKNOWN = "unknown";
    private static final String FALLS_YES = "";
    private static final String FALLS_NO = "no ";

    private String name;
    private int length;
    private String measureUnit;
    private int maxWidth;
    private boolean hasWaterFalls;
    private String countryOfOrigin;

    /** Full constructor */
    public River(String name, int length, int maxWidth, String measureUnit, boolean hasWaterFalls,
            String countryOfOrigin) {
        this.name = name;
        this.length = length;
        this.maxWidth = maxWidth;
        this.measureUnit = measureUnit;
        this.hasWaterFalls = hasWaterFalls;
        this.countryOfOrigin = countryOfOrigin;
    }

    /** Partial constructor: river name only */
    public River(String name) {
        this(name, DEFAULT_LENGTH, DEFAULT_WIDTH, DEFAULT_MEASURE_UNIT, DEFAULT_WATERFALLS, DEFAULT_ORIGIN);
    } // partial constructor

    // Accessors

    public String getName() {
        return this.name;
    }

    public int getLength() {
        return this.length;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public boolean hasWaterFalls() {
        return this.hasWaterFalls;
    }

    public String getCountryOfOrigin() {
        return this.countryOfOrigin;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    /** String representation */
    public String toString() {
        String waterfalls = (this.hasWaterFalls) ? FALLS_YES : FALLS_NO;
        return String.format("River %s is %,d %s long. Its max width is %d %s. Its headwaters are in %s. It has %swaterfalls.",
        this.name, this.length, this.measureUnit, this.maxWidth, this.measureUnit, this.countryOfOrigin, waterfalls);
    } // method toString

    /** Standard comparison */
    public int compareTo(River other) {
        return this.length- other.getLength();
    } // method compareTo

    /** Boolean equals */
    public boolean equals(River other) {
        return this.compareTo(other) == 0;
    } // method equals

    /** Driver code */
    public static void main(String[] args) {
        River amz = new River("Amazon", 2330, 9, "miles", false, "Brazil");
        River nia = new River("Niagara", 39, 1, "miles", true, "Canada");
        System.out.println(amz);
        System.out.println(nia);
    } // method main
} // class River
