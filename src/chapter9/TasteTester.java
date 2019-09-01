package chapter9;

public class TasteTester {

    public static void main(String args[])
    {
        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(35);
        System.out.println("Birthday cake flavor is: " + birthdayCake.getFlavor() + " and price is: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setPrice(45.5);
        weddingCake.setFlavor("mango");
        System.out.println("Birthday cake flavor is: " + weddingCake.getFlavor() + " and price is: " + weddingCake.getPrice());

    }

}
