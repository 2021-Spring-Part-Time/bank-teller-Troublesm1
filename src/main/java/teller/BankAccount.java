package teller;

public class BankAccount {

    private String accountNumber;
    private String type;
    private int balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public BankAccount(String accountNumber, String type, int balance) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.balance = balance;
    }
}
