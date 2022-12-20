import java.util.Scanner;

public class Transactions {

    //declare variables
    private int currentBalance = 0;
    private int lastTransaction = 0;

//    constructors
    Transactions() {
        System.out.println("What would you like to do?\n1. Deposit\n2. Withdraw\n3. Last Transaction ");
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        if(userInput == 1) {
            Deposit();
        }
        else if (userInput == 2) {
            Withdraw();
        }
        else if (userInput == 3) {
            showLastTransaction();
        }
        else {
            System.out.println("Invalid Response");
        }
    }

    public void Deposit() {
        System.out.println("Enter deposit amount: ");
        Scanner scan = new Scanner(System.in);
        int depositAmount = scan.nextInt();

        lastTransaction += depositAmount;
        currentBalance += depositAmount;

        System.out.println("Your current balance is: $" + currentBalance);
        anythingElse();

    }

    public void Withdraw() {
        System.out.println("Enter amount to withdraw: ");
        Scanner scan = new Scanner(System.in);
        int withdrawAmount = scan.nextInt();

        lastTransaction -= withdrawAmount;
        currentBalance -= withdrawAmount;

        System.out.println("Your current balance is: $" + currentBalance);
        anythingElse();

    }

    public void showLastTransaction() {
        if (lastTransaction > 0) {
            System.out.println("You deposited: $" + lastTransaction);
            System.out.println("Your current balance is: $" + currentBalance);
        }
        else if (lastTransaction > 0) {
            System.out.println("You withdrew: $" + lastTransaction);
            System.out.println("Your current balance is: $" + currentBalance);

        }
        else if (lastTransaction == 0) {
            System.out.println("No previous transactions.");
            System.out.println("Your current balance is: $" + currentBalance);

        }
        else {
            System.out.println("ERROR");
        }

        anythingElse();

    }

    public void anythingElse() {
        System.out.println("Would you like to do anything else? 1 for Yes / 2 for no ");
        Scanner scan = new Scanner(System.in);
        int userAnswer = scan.nextInt();

        if (userAnswer == 1) {
           new Transactions();
        }
        else if (userAnswer == 2) {
            System.out.println("Have a good day. Goodbye");
        }
        else {
            System.out.println("ERROR");
        }
    }

}
