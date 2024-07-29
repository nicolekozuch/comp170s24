public class County extends GeoEntity {
    private GeoEntity seat;

    public County(String name, int population) {
        super(name, population);
    }

    public void setSeat(GeoEntity seat) { this.seat = seat; }

}
