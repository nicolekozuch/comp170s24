
/**
 * A super-class for geographic entities. Most geographic entities such as
 * cities, counties, states, and countries have some common characteristics:
 * name and population at the very least. They may also be located within the
 * jurisdiction of another geographic entity, such as an administrative
 * subdivision (county, parish, borough, etc).
 */
public class GeoEntity {

    public final String NO_DATA = ">NO DATA<";

    /** The name of the geographic entity, e.g., Chicago */
    private String name;
    /** The administrative subdivision, e.g., Cook county */
    private GeoEntity container;
    /** Population */
    private int population;

    /** Partial constructor. */
    public GeoEntity(String name, int population) {
        this.name = name;
        this.population = population;
    } // partial constructor

    /** Accessor for this.name */
    public String getName() {
        return this.name;
    } // method getName

    /** Accessor for this.population */
    public int getPopulation() {
        return population;
    } // method getPopulation

    /** Accesssor for this.container */
    public GeoEntity getContainer() {
        return container;
    } // method getContainer

    /** Mutator for this.container */
    public void setContainer(GeoEntity container) {
        this.container = container;
    } // method setContainer

    /** String representation */
    public String toString() {
        String containerName = (this.container != null) ? this.container.getName() : NO_DATA;
        return String.format("\nGeographic entity: %s with population %d within %s");
    } // method toString
} // class GeoEntity
