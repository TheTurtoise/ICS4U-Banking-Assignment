import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Bank bank = new Bank();
        System.out.println("Welcome to DTX");
        System.out.println("Do you want to: ");
        System.out.println("1. Login");
        System.out.println("2. Signup");
        int choice = Input.nextInt();
        Bank account1 = new Bank();
        if (choice == 1) {
            account1.Login();
        }
        //add bulletproofing later
        else {
            account1.Signup();
            bank.writeAccountsToFile();
            bank.readAccountsFromFile();
        }
        System.out.println("Welcome to DTX Banking");
        AccountTypes user = new AccountTypes();
        System.out.print("What is your initial Savings balance: ");
        user.setSavingsBal(Input.nextDouble());;
        System.out.println(user.getSavingsBal());
        System.out.print("What is your initial chequing balance: ");
        user.setChequingBal(Input.nextDouble());;
        System.out.println("What would you like to do: ");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Predict Interest");
        System.out.println("5. exit");
        Integer option = Input.nextInt();
        BankSystem bankSystem = new BankSystem();
        switch (option) {
            case 1:
                bankSystem.Deposit(user);
                break;
            case 2:
                bankSystem.Withdraw(user);
                break;
            case 3:
                bankSystem.CheckBalance(user);
                break;
            case 4:
                bankSystem.predictInterest(user);
                break;
            default:
                System.out.println("invalid option");
        }
    }
}
