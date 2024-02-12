import org.example.Account;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AccountTest {
    Account account;

    @Test
    public void success(){
        account = new Account("Test Test");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void fail(){
        account = new Account("TestTest");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void fail2(){
        account = new Account(" Test");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void fail3(){
        account = new Account("Test ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void fail4(){
        account = new Account("Test Te st");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void fail5(){
        account = new Account("Test TestTestTestTes");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void fail6(){
        account = new Account("T ");
        assertFalse(account.checkNameToEmboss());
    }

    @Test
    public void success2(){
        account = new Account("T s");
        assertTrue(account.checkNameToEmboss());
    }

    @Test
    public void success3(){
        account = new Account("Test TestTestTestTe");
        assertTrue(account.checkNameToEmboss());
    }
}