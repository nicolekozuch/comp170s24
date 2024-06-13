/*
 * Assignment 02
 * 
 * Reorganize the code below so that there will no print statements in the 
 * main method. Instead, main should contain only 4-5 lines of code.
 * 
 */
public class Decompose_Solutions {
    public static void main(String[] args) {
        gather();
        setup();
        prep();
        bake();
        finish();  
    }

    public static void finish() {
        System.out.println("\n\nAfter baking:\n");
        System.out.println("whisk cream cheese and powder sugar");
        System.out.println("add 1 tablespoon of vanilla to frosting and whisk more.");
        System.out.println("cut bread lengthwide, in half");
        System.out.println("add layer of frosting on bottom half");
        System.out.println("place top half on top of frosting");
        System.out.println("apply frosting on bread");
    }

    public static void setup() {
        System.out.println("\n\nSetup:\n");
        System.out.println("grease baking pan");
        System.out.println("preheat over 360F");
    }

    public static void prep() {
        System.out.println("\n\nPrepare:\n");
        System.out.println("cream butter with sugar");
        System.out.println("mix bananas and eggs");
        System.out.println("add 1 tablespoon vanilla to the eggs");
        System.out.println("add bananas and eggs with creamed butter");
        System.out.println("add flour to mix");
        System.out.println("add baking powder to batter");
        System.out.println("add walnuts to the batter");
    }

    public static void bake() {
        System.out.println("\n\nBake:\n");
        System.out.println("pour batter to baking pan");
        System.out.println("bake 1 hour");
        System.out.println("let banana bread cool for 30 minutes");
    }

    public static void gather() {
        System.out.println("\n\nIngredients:\n");
        System.out.println("3 ripe bananas");
        System.out.println("chop 1/2 cup of walnuts");
        System.out.println("2 cups all purpose flour");
        System.out.println("2 tablespoons vanilla");        
        System.out.println("1/2 cup powder sugar");
        System.out.println("1/2 cup sugar");
        System.out.println("2 eggs in room temperature");
        System.out.println("1 pinch of salt");
        System.out.println("1 cup of cream cheese at room temperature");
        System.out.println("1 teaspoon of baking powder");
    }
}