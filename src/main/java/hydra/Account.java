package hydrate;



import java.util.Scanner;

class BankAccount {

    int balance;
    int previousTransaction;
    String customerName;
    String customerID;
    public int depositTransaction;
    public int withdrawTransaction;



    void deposit(Scanner sc){
        System.out.println("deposit an amount of money: ");
        int amount = sc.nextInt();
        if(amount > 0){
            balance += amount;
            System.out.println("thanks for depositing " + balance + " dollars at our bank");
            depositTransaction = balance;
        }
        else {
            System.out.println("that's not really possible");
        }

    }

    void withdrawal(Scanner sc){
        System.out.println("withdraw an amount of money: ");
        int amount = sc.nextInt();
        if(amount > 0){
            balance -= amount;
            System.out.println("thanks for withdrawing " + balance + " dollars at our bank");
            withdrawTransaction = balance;
        }
    }

    void getAllPreviousTransactions() {


        //i'm going to figure out how gson works so this function does not yet do anything

    }



    void calculatedInterest(int years) {
        System.out.println("calculate your interest\n input the years for which you wanna calculate: ");
        double interestRate = .0238;
        double newBalance =  balance * (1 + interestRate * years);
        System.out.println("The current interest rate is: " + newBalance + "%");
        System.out.println("After " + years + " years, your balance will be " + newBalance);


    }

    void selectionMenu() {
        char option = ' ';
        Scanner sc = new Scanner(System.in);
        System.out.println("hey there! welcome to our bank! type an option to get started!");
        System.out.println("A: see your balance");
        System.out.println("B: make a deposit");
        System.out.println("C: make a withdrawal");
        System.out.println("D: view previous transaction");
        System.out.println("E: calculate interest");
        System.out.println("F: quit the program");


        do {

            System.out.println("Enter an option: ");
            char option1 = sc.next().charAt(0);
            option = Character.toUpperCase(option1);
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
                case 'D' -> {
                    System.out.println("==================================================================================================================");
                    getAllPreviousTransactions();
                    System.out.println("==================================================================================================================");
                }
                case 'E' -> {
                    System.out.println("==================================================================================================================");
                    calculatedInterest(5);
                    System.out.println("==================================================================================================================");
                }
                case 'F' ->
                    System.out.println("Thanks for using the bank!");

                default ->
                    System.out.println("Error! Invalid character detected.");



            }


        }while(option != 'F');

    }
}

