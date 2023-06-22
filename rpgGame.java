import java.util.Random;
import java.util.Scanner;

public class rpgGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Witaj w mojej grze RPG!");
        System.out.print("Podaj mi imię swojego bohatera, aby rozpocząć grę - ");
        String heroName = scanner.nextLine();
        System.out.println("\nWybierz klasę bohatera:");
        System.out.println("1. Human");
        System.out.println("2. Ogre");
        System.out.println("3. Mage");
        int heroClassChoice = scanner.nextInt();
        Human hero;
        switch (heroClassChoice) {
            case 1:
                hero = new Human(heroName);
                break;
            case 2:
                hero = new Ogre(heroName);
                break;
            case 3:
                hero = new Mage(heroName);
                break;
            default:
                System.out.println("Nieprawidłowy wybór klasy.");
                hero = new Human(heroName);
                break;
        }
        System.out.println("\nTwój bohater " + hero.getName() + " został stworzony!");
    }
}

class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public Human() {

    }

    public String getName() {
        return name;
    }
}

class Ogre extends Human {
    private String name;

    public Ogre(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Mage extends Human {
    private String name;

    public Mage(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
