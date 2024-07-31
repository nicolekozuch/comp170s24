/**
 * An extension of GeoEntity, this class captures also data specific to a city.
 */
public class City extends GeoEntity {

    // Default values (for default constructor)
    private static final boolean PUBLIC_TRANSIT = false;
    private static final boolean AIRPORT = false;
    private static final boolean HARBOR = false;

    private boolean publicTransit;
    private boolean airport;
    private boolean harbor;

    /** Full constructor */
    public City(String name,
            int population,
            boolean publicTransit,
            boolean airport,
            boolean harbor) {
        // First call the super class constructor to set the name and population of the
        // geographic entity.
        super(name, population);
        // Now set the characteristic fields of this object
        this.publicTransit = publicTransit;
        this.airport = airport;
        this.harbor = harbor;
    } // full constructor

    /** Basic constructor */
    public City(String name, int population) {
        this(name, population, PUBLIC_TRANSIT, AIRPORT, HARBOR);
    } // basic constructor

    /**
     * Mutator for this object's administrative subdivision. This object is a city
     * and therefore its immediately-higher subdivision would be the county. When
     * creating a city object, with the constructor, its county may or may not exist
     * as a County object. To avoid a chicken-and-egg problem, we allow the
     * GeoEntity.container field inherited in City to remain null and we can
     * populate it later using this setCounty method.
     */
    public void setCounty(GeoEntity county) {
        this.setContainer(county);
    } // method setCounty

    /** Accessor for the name of this object's container -- the county's name */
    public String getCountyName() {
        return (this.getContainer()==null)? super.NO_DATA: this.getContainer().getName();
    } // method getCountyName

    /** String representation */
    public String toString() {
        return String.format("\n%s has a population of %,d\nThis city is in %s county",
                this.getName(), this.getPopulation(), this.getCountyName());
    } // method toString
} // class City
