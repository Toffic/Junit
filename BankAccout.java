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
public class BankAccout {

    private String firstName;
    private String lastName;
    private double balance;
     static final int CHECKING=1;
     static final int SAVINGS=2;
    
    private int accountType;

    public BankAccout(String firstName, String lastName, double balance, int accountType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
        this.accountType= accountType;
    }
    
    

    public double deposit(double amount, boolean branch) {
        this.balance += amount;
        return this.balance;
    }

    public double withdraw(double amount, boolean branch) {
       
        if (amount > 500 && branch == false){
            throw new AssertionError();
        }
        this.balance -= amount;
        return this.balance;

    }

    public double getBalance() {
        return balance;
    }

    
    public boolean isChecking(){
        return accountType == CHECKING;
    }
}
