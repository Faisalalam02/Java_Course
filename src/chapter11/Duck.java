package chapter11;

public class Duck extends Animal {


    @Override
    void makeSound() {
        System.out.println("Quack");
    }
    @Override
    public void eat()
    {
        System.out.println("Duck eat swarms.");
    }

}
