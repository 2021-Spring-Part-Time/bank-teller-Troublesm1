package teller;

import java.util.Collection;
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

    public Collection<BankAccount> getAllAccounts() {
        return accounts.values();
    }

    public void close(BankAccount account) {
        accounts.remove(account.getAccountNumber(),account);
    }
}
