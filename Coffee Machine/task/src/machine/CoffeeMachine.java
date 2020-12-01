package machine;

import java.util.*;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int beans = 120;
        int cups = 9;
        int money = 550;

        int water1 = 0;
        int milk1 = 0;
        int beans1 = 0;
        int cups1 = 0;
        String n = "";

        while (scanner.hasNext()) {
            System.out.println("Write action (buy, fill, take, remaining, exit):\n");

            String action = scanner.next();

            switch (action) {
                case "exit":
                    break;
                case "remaining":
                    System.out.println("\nThe coffee machine has:\n" +
                            water + " of water\n" +
                            milk + " of milk\n" +
                            beans + " of coffee beans\n" +
                            cups + " of disposable cups\n" +
                            "$" + money + " of money");
                    break;
                case "take":
                    System.out.println("I gave you $" + money);
                    money = 0;
                    break;
                case "fill":
                    water1 = scanner.nextInt();
                    milk1 = scanner.nextInt();
                    beans1 = scanner.nextInt();
                    cups1 = scanner.nextInt();

                    water += water1;
                    milk += milk1;
                    beans += beans1;
                    cups += cups1;

                    System.out.println("Write how many ml of water do you want to add:\n" +
                            "Write how many ml of milk do you want to add:\n" +
                            "Write how many grams of coffee beans do you want to add:\n" +
                            "Write how many disposable cups of coffee do you want to add:\n");
                    break;
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:\n");
                    n = scanner.next();
                    switch (n) {
                        case "1":
                            if (water < 250) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }

                            if (beans < 16) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            }

                            if (cups <= 1) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }

                            water -= 250;
                            beans -= 16;
                            money += 4;
                            cups -= 1;
                            System.out.println("I have enough resources, making you a coffee!");
                            break;
                        case "2":
                            if (water < 350) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }

                            if (beans < 20) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            }

                            if (cups <= 1) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }

                            water -= 350;
                            milk -= 75;
                            beans -= 20;
                            money += 7;
                            cups -= 1;

                            System.out.println("I have enough resources, making you a coffee!");
                            break;
                        case "3":
                            if (water < 200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }

                            if (beans < 12) {
                                System.out.println("Sorry, not enough beans!");
                                break;
                            }

                            if (cups <= 1) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }

                            water -= 200;
                            milk -= 100;
                            beans -= 12;
                            money += 6;
                            cups -= 1;

                            System.out.println("I have enough resources, making you a coffee!");
                            break;
                        case "back":
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    break;

            }
        }
    }
}
