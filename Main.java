import java.util.Scanner;
enum Drinks{
    COKE("Dobriy Cola", 50),
    SPRITE("Sprite", 100),
    FANTA("Fanta", 70);
    private String name;
    private int price;
    Drinks(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public int price(){
        return price;
    }
    public String getName(){
        return name;
    }
}

enum Money{
    DESYATKA(10),
    PYATEHAT(50),
    CHIRIK(100);
    private int value;
    Money(int value) {
        this.value=value;
    }
    public int value() {
        return value;
    }
}


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose drink");
        int c = 0;
        for ( Drinks drink : Drinks.values()) {
            System.out.print(c + " " + drink + " ");
            System.out.println(drink.price());
            c++;
        }
        int choose = scanner.nextInt();
        Drinks drink;
        switch (choose) {
            case 0: drink = Drinks.COKE; break;
            case 1: drink = Drinks.SPRITE; break;
            case 2: drink = Drinks.COKE; break;
            default: System.out.println("Error: no such drink"); return;
        }

        System.out.println("Insert one of the following banknotes:");
        for ( Money banknote : Money.values()) {
            System.out.print(banknote + " ");
            System.out.print(banknote.value());
        }

        int cash = 0;
        while(cash < drink.price()) {
            int banknote = scanner.nextInt();
            if (!(banknote == 10 || banknote == 50 || banknote == 100)) {
                System.out.print("Invalid banknote"); return;
            }
            cash += banknote;
        }
        System.out.println("Succsesfully bought " + drink.getName() + ", remainder:");
        int remainder = cash - drink.price();

        while(remainder/100 != 0) {
            System.out.println("100");
            remainder -= 100;
        }

        while(remainder/50 != 0) {
            System.out.println("50");
            remainder -= 50;
        }

        while(remainder/10 != 0) {
            System.out.println("10");
            remainder -= 10;
        }

    }
}