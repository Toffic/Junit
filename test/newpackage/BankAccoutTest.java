/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pro
 */
public class BankAccoutTest {
private  BankAccout account;
private static int count;
    public BankAccoutTest() {
        System.out.println("Runnig a test");
    }

    @BeforeClass
    public static void setUpClass() {
        System.out.println("this execute before any test cases !!! also count = " + count ++);
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("this execute after all test cases !! also count= "+ count++);
    }

    @Before
    public void setUp() {
                account = new BankAccout("", "", 1000.00,BankAccout.CHECKING);

    }

    @After
    public void tearDown() {
        
        System.out.println("after a class  also count="+ count++);
    }

    /**
     * Test of deposit method, of class BankAccout.
     */
    @Test
    public void testDeposit() {
   account = new BankAccout("", "", 1000.00,BankAccout.CHECKING);
        double balance = account.deposit(200, true);
        assertEquals(1200, balance, 0);

    }

    /**
     * Test of withdraw method, of class BankAccout.
     */
    @Test
    public void testWithdraw_branch() {
assertEquals(400,account.withdraw(600, true),0);
    }

    
      @Test(expected=AssertionError.class)
    public void testWithdraw_notbranch() {
account.withdraw(600,false);
fail("expected to be thrown an AssertionError");
    }
    /**
     * Test of getBalance method, of class BankAccout.
     */
    @Test
    public void testGetBalance() {
    account= new BankAccout("", "", 1000.00,BankAccout.CHECKING);
        account.deposit(200, true);

        assertEquals(1200, account.getBalance(), 0);
    }

    @Test
    public void getBalance_withdraw() {
       account = new BankAccout("", "", 1000.00,BankAccout.CHECKING);
        account.withdraw(200, true);

        assertEquals(800, account.getBalance(), 0);
    }
    
    
    
    @Test
    public void isChecking_true(){
        account = new BankAccout("", "", 1000.00,BankAccout.CHECKING);
   assertTrue("the accout is saving rather",account.isChecking());  
        
    }

}
