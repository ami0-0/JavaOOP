import java.util.Scanner;

public class Main {
    public static void choose() {
        System.out.println("\nChoose an option:");
        System.out.println("    1 - walk");
        System.out.println("    2 - ride a horse");
        System.out.println("    3 - fly");
        System.out.println("    4 - Start moving");
        System.out.println("    0 - exit");
        System.out.print("Your choice: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hero hero = new Hero();

        System.out.println("Welcome!\n" +
                "Start position: " + hero.getPointA());

        while (true) {
            choose();

            if (!scanner.hasNextInt()) {
                System.out.println("Error: please enter a number! Try again.");
                scanner.next();
                continue;
            }

            int type = scanner.nextInt();

            if (type == 0) {
                return;
            } else if (type==1) {
                hero.changeStrategy(new WalkStrategy());
                System.out.println("Now you're walking");
            } else if (type==2) {
                hero.changeStrategy(new HorseStrategy());
                System.out.println("Now you're riding a horse");
            } else if (type==3) {
                hero.changeStrategy(new FlyStrategy());
                System.out.println("Now you're flying");
            } else if (type == 4) {
                System.out.print("Your current position: " + hero.getPointA() + ". \n" +
                        "Where do you want to go: ");

                if (!scanner.hasNextInt()) {
                    System.out.println("Error: please enter a number! Try again.");
                    scanner.next();
                    continue;
                }

                int pointB = scanner.nextInt();

                if (pointB == hero.getPointA()) {
                    System.out.println("You already here! Try again and enter another number.");
                } else if (pointB < 0) {
                    System.out.println("Error: destination can't be negative. Try again.");
                } else {
                    hero.startMoving(pointB);
                    System.out.println("Your new position is " + hero.getPointA());
                }
            } else {
                System.out.println("Error: unknown option. Try again.");
            }
        }
    }
}