package Day4;

import java.util.Scanner;

class CoffeWallet {

    private float totalAmount;
    private String name;

    public CoffeWallet() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome! Enter the following credentials");

        System.out.println("Enter your name");
        this.name = sc.nextLine();

        System.out.println("Enter the initial deposit");
        this.totalAmount = sc.nextFloat();
    }

    void accout_overview() {
        System.out.println("Username: " + name);
        System.out.println("The total balance is: " + totalAmount);
    }

    void deposit() {
        System.out.println("Enter deposit");
        Scanner sc1 = new Scanner(System.in);
        float amount = sc1.nextFloat();
        totalAmount += amount;
        System.out.println("The total amount after deposit is: " + totalAmount);
    }

    void withdrawl() {
        System.out.println("Enter the amount of purchase");
        Scanner sc2 = new Scanner(System.in);
        float purchaseAmount = sc2.nextFloat();
        if (totalAmount < purchaseAmount) {
            System.out.println("Insufficient balance: " + totalAmount);
        } else {
            totalAmount -= purchaseAmount;

            System.out.println("The total purchase is of amount: " + purchaseAmount);
            System.out.println("The total balance remaining is: " + totalAmount);
        }
    }
}

public class CoffeShop {

    public static void main(String[] args) {

        CoffeWallet c = new CoffeWallet();

        c.accout_overview();
        c.deposit();
        c.withdrawl();
    }
}