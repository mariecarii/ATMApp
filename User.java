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

        new Transactions();

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


}
