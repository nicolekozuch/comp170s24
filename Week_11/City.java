public class City extends GeoEntity, SomethingElse {

    private boolean publicTransit;
    private boolean airport;
    private boolean harbor;

    public City(String name,
            int population,
            boolean publicTransit,
            boolean airport,
            boolean harbor) {
        super(name, population);
        this.publicTransit = publicTransit;
        this.airport = airport;
        this.harbor = harbor;
    }

    public void setCounty(GeoEntity county) {
        this.setContainer(county);
    }

    

    public String getCountyName() {
        return this.getContainer().getName();
    }
    public String toString() {
        return String.format("City of %s has a population of %,d\nThis city is in %s county",
                this.getName(), this.getPopulation(), this.getCountyName());
    }
}
