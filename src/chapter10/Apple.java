package chapter10;

public class Apple extends Fruit {

    public Apple()
    {
        setCalories(52);
    }

    public void removeSeeds()
    {
        System.out.println("Apple seeds has been removed");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice has been ready");
    }
}
