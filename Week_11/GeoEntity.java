public class GeoEntity {
    
    private String name;
    private GeoEntity container;
    private int population;
    private String flagFileName;

    public GeoEntity(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setContainer(GeoEntity container) {
        this.container = container;
    }

    public GeoEntity getContainer() {
        return container;
    }

    
    
}
