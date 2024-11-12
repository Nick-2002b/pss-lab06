package it.unibo.bank.impl;

import it.unibo.bank.api.AccountHolder;
import it.unibo.bank.api.BankAccount;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Test class for the {@link StrictBankAccount} class.
 */
class TestStrictBankAccount {

    // Create a new AccountHolder and a StrictBankAccount for it each time tests are executed.
    private AccountHolder mRossi;
    private BankAccount bankAccount;
    private AccountHolder nico;
    private StrictBankAccount strictBankAccount;
    /**
     * Prepare the tests.
     */
    @BeforeEach
    public void setUp() {
        this.mRossi = new AccountHolder("Mario", "Rossi", 0);
        this.nico = new AccountHolder("Nico", "Verdi", 1);
        this.bankAccount = new SimpleBankAccount(mRossi, 0.0);
        this.strictBankAccount = new StrictBankAccount(nico, 0.0);
        // fail("To be implemented");
    }

    /**
     * Test the initial state of the StrictBankAccount.
     */
    @Test
    public void testInitialization() {
        assertEquals(0.0, bankAccount.getBalance());
        assertEquals(0.0, strictBankAccount.getBalance());
        assertEquals(0, bankAccount.getTransactionsCount());
        assertEquals(0, strictBankAccount.getTransactionsCount());
        assertEquals(0, mRossi.getUserID());
        assertEquals(1, nico.getUserID());
        assertEquals(mRossi, bankAccount.getAccountHolder());
        assertEquals(nico, strictBankAccount.getAccountHolder());
        
        // fail("To be implemented");
    }

    /**
     * Perform a deposit of 100€, compute the management fees, and check that the balance is correctly reduced.
     */
    @Test
    public void testManagementFees() {
        bankAccount.deposit(0, 100);
        assertEquals(100, bankAccount.getBalance());
        
        // fail("To be implemented");
    }

    /**
     * Test that withdrawing a negative amount causes a failure.
     */
    @Test
    public void testNegativeWithdraw() {
        fail("To be implemented");
    }

    /**
     * Test that withdrawing more money than it is in the account is not allowed.
     */
    @Test
    public void testWithdrawingTooMuch() {
        fail("To be implemented");
    }
}
