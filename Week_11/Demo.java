public class Demo {
    public static void main(String[] args) {
        City c1 = new City("Chicago", 3_000_000);
        System.out.println(c1);
        County y1 = new County("Cook", 4000000) ;
        System.out.println(y1);
        y1.setSeat(c1);
        System.out.println(y1);
        c1.setCounty(y1);
        System.out.println(c1);
    }
}
