package chapter10;

public class Banana extends Fruit {

    public Banana()
    {
        setCalories(89);
    }
    public void peel()
    {
        System.out.println("Banana peel has been removed.");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana shake has been ready");
    }
}
