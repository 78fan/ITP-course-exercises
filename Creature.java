import java.awt.*;

public abstract class Creature {
    protected String name = null;
    protected boolean isAlive = false;
    abstract void bear(String name);
    abstract void die();
    public void shoutName() {
        if (name!=null) {
            System.out.println(name);
        } else {
            System.out.println("Error");
        }
    }
}

class Animal extends Creature{
    void bear(String name) {
        this.name = name;
        System.out.println("The Animal " + name + " was born");
    }
    void die() {
        this.name = name;
        System.out.println("The Animal " + name + " has died");
    }
}

final class Human extends Animal{
    void bear(String name) {
        this.name = name;
        System.out.println("The Human " + name + " was born");
    }
    void die() {
        this.name = name;
        System.out.println("The Human " + name + " has died");
    }
}

final class Dog extends Animal{
    void bear(String name) {
        this.name = name;
        System.out.println("The Dog " + name + " was born");
    }
    void die() {
        this.name = name;
        System.out.println("The Dog " + name + " has died");
    }
    public void bark() {
        System.out.println("Wef");
    }
}

class Alien extends Creature{
    void bear(String name) {
        this.name = name;
        System.out.println("The Alien " + name + " was born");
    }
    void die() {
        this.name = name;
        System.out.println("The Alien " + name + " has died");
    }
}
