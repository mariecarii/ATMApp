import java.util.Scanner;

public class User {

    //declare variables
    String fullName;
    String userID = "";

    //constructor for name
    User() {
        System.out.println("Enter your first and last name: ");
        Scanner scan = new Scanner(System.in);
        this.fullName = scan.nextLine();



    }

    public String createUserID() {
        userID = fullName;
        return userID;
    }

}
