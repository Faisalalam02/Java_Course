package chapter10;

public class Market {

    public static void main (String args[])
    {
        System.out.println("\nApple Juice:");
        Fruit apple = new Apple();
        ((Apple)apple).removeSeeds();
        apple.makeJuice();
        double appleCalories = apple.getCalories();
        System.out.println("Apple juice have " + appleCalories + " calories");

        System.out.println("\nBanana Juice:");
        apple = new Banana();
        ((Banana)apple).peel();
        apple.makeJuice();
        apple.getCalories();
        double bananaCalories = apple.getCalories();
        System.out.println("Banana juice have " + bananaCalories + " calories");


    }


}
