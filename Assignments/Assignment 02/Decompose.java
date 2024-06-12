/*
 * Assignment 02
 * 
 * Reorganize the code below so that there will no print statements in the 
 * main method. Instead, main should contain only 4-5 lines of code.
 * 
 */
public class Decompose {
    public static void main(String[] args) {
        printIngredients();
        createBatter();
        createFrosting();
        bakeBread();
        frostBread();
    }

    public static void printIngredients() {
        System.out.println("Ingredients:");
        System.out.println("3 ripe bananas");
        System.out.println("2 cups all purpose flour");
        System.out.println("2 tablespoons vanilla");
        System.out.println("1/2 cup powder sugar");
        System.out.println("1/2 cup sugar");
        System.out.println("2 eggs in room temperature");
        System.out.println("1 pinch of salt");
        System.out.println("1 cup of cream cheese at room temperature");
        System.out.println("1 teaspoon of baking powder\n");
    }

    public static void createBatter() {
        System.out.println("Batter Recipe:");
        System.out.println("cream butter with sugar");
        System.out.println("mix bananas and eggs");
        System.out.println("add bananas and eggs with creamed butter");
        System.out.println("add 1 tablespoon vanilla to the eggs");
        System.out.println("chop 1/2 cup of walnuts");
        System.out.println("add walnuts to the batter");
        System.out.println("add flour to mix");
        System.out.println("add baking powder to batter\n");
    }

    public static void createFrosting() {
        System.out.println("Frosting Recipe:");
        System.out.println("whisk cream cheese and powder sugar");
        System.out.println("add 1 tablespoon of vanilla to frosting and whisk more.\n");
    }

    public static void bakeBread() {
        System.out.println("Baking:");
        System.out.println("preheat over 360F");
        System.out.println("grease baking pan");
        System.out.println("pour batter to baking pan");
        System.out.println("bake 1 hour");
        System.out.println("let banana bread cool for 30 minutes\n");
    }

    public static void frostBread() {
        System.out.println("Decorating:");
        System.out.println("apply frosting on bread");
        System.out.println("cut bread lengthwide, in half");
        System.out.println("add layer of frosting on bottom half");
        System.out.println("place top half on top of frosting");
    }
}