package teller;
import java.util.Scanner;

public class BankingApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bank myBank = new Bank();

        BankAccount account1 = new BankAccount("1111", "Checking",500);
        BankAccount account2 = new BankAccount("2222","Savings",1000);

        myBank.add(account1);
        myBank.add(account2);

        String userChoice;

        System.out.println("These are your accounts with us");
        myBank.showAccounts();
        System.out.println("What would you like to do?");
        System.out.println("Choose an option");
        System.out.println("Press 1 to deposit funds");
        System.out.println("Press 2 to withdrawal funds");
        System.out.println("Press 3 to check your balance");
        System.out.println("Press 4 to close an account");
        System.out.println("Press 5 to exit");
        userChoice = input.nextLine();

        if(choice.equals("1")) {
            System.out.println("You want to dposit");
            System.out.println("Here are your accounts");
            myBank.showAccounts();
      }
    }
}
