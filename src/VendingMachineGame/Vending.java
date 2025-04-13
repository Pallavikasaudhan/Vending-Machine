
package VendingMachineGame;
import java.util.Scanner;

public class Vending {

    Vending() {
        System.out.println("====== Vending Machine Started ======");
    }

    public DrinkingType selectDrink() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount you inserted (₹): ");
       
        int amount = sc.nextInt();

        if (amount <= 20) {
            System.out.println("You get a Tea!");
            int price = 20;
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            int total = price * qty;

            System.out.println("Total Price: ₹" + total);
            if (amount >= total) {
                System.out.println("Dispensing " + qty + " Snack(s).");
                System.out.println("Returned Amount: ₹" + (amount - total));
            } else {
                System.out.println("Insufficient amount! Required: ₹" + total);
            }
            return new Tea();
        }

        else if (amount <= 50) {
            System.out.println("Press 1 for => Coffee  |  2 for => Wine");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You selected Coffee.");
                    int drinkPrice = 25;
                    System.out.print("Enter number of cups: ");
                    int cups = sc.nextInt();
                    int totalDrink = drinkPrice * cups;

                    System.out.println("Total Price: ₹" + totalDrink);
                    if (amount >= totalDrink) {
                        System.out.println("Dispensing " + cups + " cup(s) of Drink.");
                        System.out.println("Returned Amount: ₹" + (amount - totalDrink));
                    } else {
                        System.out.println("Insufficient amount! Required: ₹" + totalDrink);
                    }
                    return new Coffee();

                case 2:
                    System.out.println("You selected Wine.");
                    int chocoPrice = 30;
                    System.out.print("Enter quantity: ");
                    int chocoQty = sc.nextInt();
                    int totalChoco = chocoPrice * chocoQty;

                    System.out.println("Total Price: ₹" + totalChoco);
                    if (amount >= totalChoco) {
                        System.out.println("Dispensing " + chocoQty + " Wine(s).");
                        System.out.println("Returned Amount: ₹" + (amount - totalChoco));
                    } else {
                        System.out.println("Insufficient amount! Required: ₹" + totalChoco);
                    }
                    return new Wine();

                default:
                    System.out.println("Invalid choice! Try again.");
                    return selectDrink();
            }
        }

        else {
            System.out.println("You get a Premium Wine!");
            int price = 30;
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            int total = price * qty;

            System.out.println("Total Price: ₹" + total);
            if (amount >= total) {
                System.out.println("Dispensing " + qty + " Chocolate(s).");
                System.out.println("Returned Amount: ₹" + (amount - total));
            } else {
                System.out.println("Insufficient amount! Required: ₹" + total);
            }
            return new Wine();
        }
    }

//    public static void main(String[] args) {
//        Vending vm = new Vending();
//        DrinkingType d= vm.selectDrink();
//        d.drink();
//    }
}
