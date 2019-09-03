package chapter11;

public class Horse extends Animal {

    @Override
    void makeSound() {
        System.out.println("neighhhh");
    }

    @Override
    public void eat()
    {
        System.out.println("Horsse eat grass.");
    }

}
