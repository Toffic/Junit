/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Pro
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class BankAccountParameterizedTest {

    private BankAccout bankAccount;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountParameterizedTest(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @Before
    public void beforeTest() {
        bankAccount = new BankAccout("Toffic", "Nketia", 1000, BankAccout.CHECKING);
        System.out.println("Running a test");

    }

    @Parameterized.Parameters
    @SuppressWarnings("empty-statement")
    public static Collection<Object> testConditions() {
     
     return Arrays.asList(new Object [][]{
            
      {100, true, 1100},
       {200, true, 1200},
      {300, true, 1300},
       {489.33, true, 1489.33},
       {500, true, 1500}

     });
      
     
   

    }

    @Test
    public void testDeposit() throws Exception {
        double balance = bankAccount.deposit(amount, branch);
        System.out.println(bankAccount.getBalance());
        assertEquals(expected, bankAccount.getBalance(), 0);

    }

}
