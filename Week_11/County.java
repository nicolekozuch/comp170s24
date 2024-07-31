/**
 * Extends GeoEntity to create an object suitable for capturing county
 * information. A county has a name and population (provided through the
 * super-class GeoEntity), as well as a county seat. The county seat is a city,
 * itself an object also extending GeoEntity.
 */
public class County extends GeoEntity {

    /** The county seat is a City object */
    private City seat;

    /**
     * Basic constructor. To avoid a chicken-and-egg problem, we allow a county to
     * be instantiated just with a name and population. The county seat is left null
     * and will be assigned with a mutator.
     */
    public County(String name, int population) {
        super(name, population);
        this.seat = null;
    } // basic constructor

    /** Mutator for this.seat */
    public void setSeat(City seat) {
        this.seat = seat;
    } // method setSeat

    /** String representation */
    public String toString() {
        String countyName = (this == null) ? super.NO_DATA : this.getName();
        String seatName = (this.seat == null) ? super.NO_DATA : this.seat.getName();
        return String.format("\nCounty: %s - Seat: %s",
                countyName, seatName);
    } // method toString
} // class County
