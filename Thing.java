interface Swimmable{
    void swim();
    void stopSwimming();
}

interface Flyable{
    void fly();
    void stopFlying();
}

interface Living{
    default void live(){
        System.out.println("[class name] lives");
    };
}

class Submarine implements Swimmable{
    public void swim(){
        System.out.println("Swimming");
    }
    public void stopSwimming(){
        System.out.println("Stoped Swimming");
    }
}

class Duck implements Swimmable, Flyable, Living{
    public void swim(){
        System.out.println("Swimming");
    }
    public void stopSwimming(){
        System.out.println("Stopped Swimming");
    }
    public void fly(){
        System.out.println("Flying");
    }
    public void stopFlying(){
        System.out.println("Stopped Flying");
    }
    public void live(){
        System.out.println("Duck lives");
    }
}

class Penguin implements Swimmable, Living{
    public void swim(){
        System.out.println("Swimming");
    }
    public void stopSwimming(){
        System.out.println("Stopped Swimming");
    }
    public void live(){
        System.out.println("Duck lives");
    }
}
