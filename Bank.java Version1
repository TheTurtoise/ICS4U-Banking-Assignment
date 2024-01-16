import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bank {
    private String name = "DTX";
    private HashMap<String, String> userAccounts = new HashMap<>();

    public void Signup() {
        Scanner input = new Scanner(System.in);
        System.out.println("===Signup===");

        while (true) {
            System.out.print("Enter the signup username: ");
            String signupUsername = input.next();

            if (userAccounts.containsKey(signupUsername)) {
                System.out.println("This account is already in use. Please try again.");
            } else {
                System.out.print("Enter the signup password: ");
                String signupPassword = input.next();

                userAccounts.put(signupUsername, signupPassword);
                System.out.println("Signup successful.");
            }

            System.out.print("Would you like to create another account (y/n)? ");
            String answer = input.next();

            if (!answer.equalsIgnoreCase("y")) {
                break;
            }
        }

        Login();
    }

    public void Login() {
        Scanner input = new Scanner(System.in);
        System.out.println("===Login===");
        System.out.print("Enter your username: ");
        String loginUsername = input.next();
        System.out.print("Enter your password: ");
        String loginPassword = input.next();

        if (userAccounts.containsKey(loginUsername) && userAccounts.get(loginUsername).equals(loginPassword)) {
            System.out.println("Login successful.\n");
        } else {
            System.out.println("Username or password is incorrect.");
        }
    }
}
