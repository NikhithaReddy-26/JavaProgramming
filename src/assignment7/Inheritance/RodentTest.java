package assignment7.Inheritance;


abstract class Rodent {
    Rodent() {
        System.out.println("This is a " + getClass().getSimpleName());
    }

    abstract void eat();

    abstract void run();
}

class Mouse extends Rodent {
    @Override
    void eat() {
        System.out.println("Mouse is eating");
    }

    @Override
    void run() {
        System.out.println("Mouse is running");
    }
}

class Gerbil extends Rodent {
    @Override
    void eat() {
        System.out.println("Gerbil is eating");
    }

    @Override
    void run() {
        System.out.println("Gerbil is running");
    }
}

class Hamster extends Rodent {
    @Override
    void eat() {
        System.out.println("Hamster is eating");
    }

    @Override
    void run() {
        System.out.println("Hamster is running");
    }
}

public class RodentTest {
    public static void main(String[] args) {
        Rodent[] rodents = { new Mouse(), new Gerbil(), new Hamster() };

        for (Rodent rodent : rodents) {
            rodent.eat();
            rodent.run();
            System.out.println();
        }
    }
}
