package Canteen;

import java.util.*;

public class Main {
    static List<String> customerOrders = new ArrayList<>();
    static int totalPrice = 0;

    static void addOrder(int itemPrice) {
        customerOrders.add("Item Price: " + itemPrice);
        totalPrice += itemPrice;
    }

    static void displayOrder() {
        System.out.println("Customer Orders: " + customerOrders);
        System.out.println("Total Price: " + totalPrice);
    }

    public static void main(String[] args) {
        Pass p = new Pass();
        p.CS1(); // Initialize password for Adrian Dinapa
        p.CS2(); // Initialize password for Aris Di Pinaldo
        p.CS3(); // Initialize password for Alex Di Giniba

        Scanner sc = new Scanner(System.in);
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.println("Welcome to the Canteen");
            System.out.println("1. Adrian Dinapa");
            System.out.println("2. Aris Di Pinaldo");
            System.out.println("3. Alex Di Giniba");
            System.out.print("Choose your account: ");
            
            int choice = 0;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.next(); // Clear the invalid input
                continue; // Retry the loop
            }

            System.out.print("Enter your password: ");
            String pass = sc.next();

            switch (choice) {
                case 1:
                    if (pass.equals(p.C1)) {
                        loggedIn = true;
                    } else {
                        System.out.println("Invalid password. Please try again.");
                    }
                    break;
                case 2:
                    if (pass.equals(p.C2)) {
                        loggedIn = true;
                    } else {
                        System.out.println("Invalid password. Please try again.");
                    }
                    break;
                case 3:
                    if (pass.equals(p.C3)) {
                        loggedIn = true;
                    } else {
                        System.out.println("Invalid password. Please try again.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        // After successful login, display food items
        Foods_and_Prices f = new Foods_and_Prices();
        f.turon();
        f.bananaQ();
        f.dutchmill();
        f.chuckie();
        f.oreo();
        f.skyflakes();
        f.hotdog();
        f.cheesesticks();
        f.breadroll();

        System.out.println("Welcome to the Canteen");
        System.out.println("1. " + f.turon);
        System.out.println("2. " + f.bananaQ);
        System.out.println("3. " + f.dutchmill);
        System.out.println("4. " + f.chuckie);
        System.out.println("5. " + f.oreo);
        System.out.println("6. " + f.skyflakes);
        System.out.println("7. " + f.hotdog);
        System.out.println("8. " + f.cheesesticks);
        System.out.println("9. " + f.breadroll);
        System.out.print("Choose your order (enter item numbers separated by spaces): ");
        
        sc.nextLine(); // Consume newline
        String orderInput = sc.nextLine();
        String[] orders = orderInput.split(" ");
        
        for (String order : orders) {
            int itemNumber = Integer.parseInt(order);
            switch (itemNumber) {
                case 1:
                    addOrder(f.turon);
                    break;
                case 2:
                    addOrder(f.bananaQ);
                    break;
                case 3:
                    addOrder(f.dutchmill);
                    break;
                case 4:
                    addOrder(f.chuckie);
                    break;
                case 5:
                    addOrder(f.oreo);
                    break;
                case 6:
                    addOrder(f.skyflakes);
                    break;
                case 7:
                    addOrder(f.hotdog);
                    break;
                case 8:
                    addOrder(f.cheesesticks);
                    break;
                case 9:
                    addOrder(f.breadroll);
                    break;
                default:
                    System.out.println("Invalid item number: " + itemNumber);
            }
        }
        
        displayOrder();
        
        // Payment processing
        System.out.print("Enter payment amount: ");
        int payment = sc.nextInt();
        if (payment >= totalPrice) {
            System.out.println("Payment successful. Change: " + (payment - totalPrice));
        } else {
            System.out.println("Insufficient payment. Please try again.");
        }
    }
}
