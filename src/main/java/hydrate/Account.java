package hydrate;

import java.util.Scanner;

public class Account {

    //todo use these fields or remove them!!
    private int depositTransaction;
    private int withdrawTransaction;
    private int balance;
    private int previousTransaction;
    private String customerName;
    private String customerID;
    private Scanner amount; // why is this a Scanner?

    public void deposit(final Scanner sc) {
        // TODO Recommendation: Keep the IO stuff (Scanner) out of this by replacing the Scanner parameter with int
        System.out.println("deposit an amount of money: ");
        final int amount = sc.nextInt();
        if (amount > 0) {
            balance += amount;
            System.out.println("thanks for depositing " + balance + " dollars at our bank");
        } else {
            System.out.println("that's not really possible");
        }
    }

    public void withdrawal(final Scanner sc) {
        // TODO same with here (see line 17)
        System.out.println("withdraw an amount of money: ");
        int amount = sc.nextInt();
        if (amount > 0) {
            balance -= amount;
            System.out.println("thanks for withdrawing " + balance + " dollars at our bank");
        }
    }

    public void calculatedInterest(final int years) {
        // TODO Make this return a double
        double interestRate = .0238;
        double newBalance = balance * (1 + interestRate * years);
    }

    //todo use this somewhere please, it seems like a good concept but just not being used
    public void selectionMenu() {
        // TODO call this in the main method
        final Scanner sc = new Scanner(System.in);
        System.out.println("hey there! welcome to our bank! type an option to get started!");
        System.out.println("A: see your balance");
        System.out.println("B: make a deposit");
        System.out.println("C: make a withdrawal");
        System.out.println("D: view previous transaction");
        System.out.println("E: calculate interest");
        System.out.println("F: quit the program");

        char option;
        do {
            System.out.println("Enter an option: ");
            option = Character.toUpperCase(sc.next().charAt(0));
            System.out.println();

            switch (option) {
                case 'A' -> {
                    System.out.println("==================================================================================================================");
                    System.out.println("your current balance is $ " + balance);
                    System.out.println("==================================================================================================================");
                }
                case 'B' -> {
                    System.out.println("================================================================================================================== ");
                    deposit(sc);
                    System.out.println("==================================================================================================================");
                }
                case 'C' -> {
                    System.out.println("==================================================================================================================");
                    withdrawal(sc);
                    System.out.println("==================================================================================================================");
                }
                case 'E' -> {
                    System.out.println("==================================================================================================================");
                    calculatedInterest(5);
                    System.out.println("==================================================================================================================");
                }
                case 'F' -> System.out.println("Thanks for using the bank!");
                default -> System.out.println("Error! Invalid character detected.");
            }
        } while (option != 'F');
    }

    // TODO Remove some of these if you aren't using them.
    public int getDepositTransaction() {
        return depositTransaction;
    }

    public void setDepositTransaction(int depositTransaction) {
        this.depositTransaction = depositTransaction;
    }

    public int getWithdrawTransaction() {
        return withdrawTransaction;
    }

    public void setWithdrawTransaction(int withdrawTransaction) {
        this.withdrawTransaction = withdrawTransaction;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPreviousTransaction() {
        return previousTransaction;
    }

    public void setPreviousTransaction(int previousTransaction) {
        this.previousTransaction = previousTransaction;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}