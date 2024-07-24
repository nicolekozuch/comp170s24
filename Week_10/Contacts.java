public class Contacts {
    public static void main(String[] args) {

      Person p1 = new Person("Nicole");
      p1.setFavoriteSnack("peaches");

      Person p2 = new Person("Michael");
      p2.setFavoriteSnack("chips");

      Person p3 = new Person("Evey");
      p3.setFavoriteSnack("tomatoes");

      p2.snacking();
      p1.snacking();
      p3.snacking();

      }
}
