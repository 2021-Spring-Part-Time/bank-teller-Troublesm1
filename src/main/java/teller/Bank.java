package teller;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    Map<String, BankAccount> accounts = new HashMap<>();

    public void add(BankAccount accountToAdd) {
        accounts.put(accountToAdd.getAccountNumber(), accountToAdd);

    }

    public BankAccount findAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}
