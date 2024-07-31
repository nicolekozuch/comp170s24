public class Demo {
    public static void main(String[] args) {
        // Let's create a basic city and see what it looks like when printed
        City chicago = new City("Chicago", 3_000_000);
        System.out.println(chicago);
        // Let's create a basic county and see what it looks like when printed
        County cook = new County("Cook", 4_000_000) ;
        System.out.println(cook);
        // Let's make city chicago the seat of county cook and see what's printed now
        cook.setSeat(chicago);
        System.out.println(cook);
        // And let's place city chicago within county cook and see the print result.
        chicago.setCounty(cook);
        System.out.println(chicago);
    }
}
