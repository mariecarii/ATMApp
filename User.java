import java.util.Scanner;


public class User {

    //declare variables
    private String fullName;
    private String userID = "";

    //constructor for name
    User() {
        System.out.println("Enter your first and last name: ");
        Scanner scan = new Scanner(System.in);
        this.fullName = scan.nextLine();

        if (fullName.length() <=2) {
            throw  new RuntimeException("Invalid Name (must be more than 2 letters)");
        }

        this.userID = createUserID();

        System.out.println("Hello "+ fullName.toUpperCase() + ".\nYour user ID is: " + userID);

        System.out.println("**********************");

        System.out.println("Would you like to sign in? 1 for Yes / 2 for No" );
        Scanner scan2 = new Scanner(System.in);
        int userAnswer = scan2.nextInt();

        if (userAnswer == 1) {
            login();
        }
        else if (userAnswer == 2) {
            System.out.println("Have a good day. Goodbye");
        }
        else {
            System.out.println("ERROR");
        }


    }

    public String createUserID() {
        int length = 3;
        String numberSet = "1234567890";
        char[] id = new char[3];
        for (int i = 0; i < 3; i++) {
            int random = (int) (Math.random() * numberSet.length());
            id[i] = numberSet.charAt(random);
        }


        userID = fullName.substring(0,2).toUpperCase() + String.valueOf(id);
        return userID;
    }

    public void login() {
        System.out.println("Welcome to the Bank");
        System.out.println("Please enter your user ID to log in.");

        Scanner scan = new Scanner(System.in);
        String userIDInput = scan.nextLine();


        if (userIDInput.equals(userID)) {
            System.out.println("Sign in successful");
            new Transactions();
        }
        else if (!(userIDInput.equals(userID))) {
            System.out.println("Incorrect ");
        }
        else {
            System.out.println("ERROR");
        }

    }


}
