package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccounTest {

    @Test
    public void test_initial_balance(){
        BankAccount bankAccount = new BankAccount(100);
        assertEquals(100, bankAccount.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_initial_balance_negative(){
        new BankAccount(-100);
    }

    @Test
    public void test_deposit(){
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.deposit(50);
        assertEquals(150, bankAccount.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_deposit_negative(){
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.deposit(-50);
    }

    @Test
    public void test_withdraw(){
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.withdraw(50);
        assertEquals(50, bankAccount.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_withdraw_negative(){
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.withdraw(-50);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_withdraw_over_balance(){
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.withdraw(150);
    }

    @Test
    public void test_transfer(){
        BankAccount bankAccount1 = new BankAccount(100);
        BankAccount bankAccount2 = new BankAccount(50);
        bankAccount1.transfer(50, bankAccount2);
        assertEquals(50, bankAccount1.getBalance(), 0.01);
        assertEquals(100, bankAccount2.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_transfer_over_balance(){
        BankAccount bankAccount1 = new BankAccount(100);
        BankAccount bankAccount2 = new BankAccount(50);
        bankAccount1.transfer(150, bankAccount2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_transfer_negative(){
        BankAccount bankAccount1 = new BankAccount(100);
        BankAccount bankAccount2 = new BankAccount(50);
        bankAccount1.transfer(-50, bankAccount2);
    }

}
