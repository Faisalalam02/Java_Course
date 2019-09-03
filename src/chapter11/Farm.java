package chapter11;

public class Farm {

    public static void main (String args[]) {
        Animal tim = new Horse();
        tim.makeSound();
        tim.eat();

        tim = new Duck();
        tim.makeSound();
        tim.eat();

    }
}
