package teller;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    Bank underTest;
    BankAccount account1;
    BankAccount account2;

    @BeforeEach
    public void setUp(){
        underTest = new Bank();
        account1 = new BankAccount("1", "Checking", 100);
        account2 = new BankAccount("2", "Savings", 100);
    }

    @Test
    public void shouldBeAbleToAddAccount(){
        underTest.add(account1);
        BankAccount retrievedAccount = underTest.findAccount("1");
        assertEquals(retrievedAccount, account1);
    }
}
