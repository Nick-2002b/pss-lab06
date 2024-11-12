package it.unibo.inheritance.impl;

public class ExtendedStrictBankAccount extends SimpleBankAccount {
    private static final double TRANSACTION_FEE = 0.1;

    public ExtendedStrictBankAccount(final int id, final double balance){
        super(id, balance);
    }
    
    private boolean isWithdrawAllowed(final double amount){
        if (amount <= getBalance()){
            return true;
        }
        return false;
    }
    @Override
    public void chargeManagementFees(final int id){
        final double feeAmount = MANAGEMENT_FEE + getTransactionsCount() * ExtendedStrictBankAccount.TRANSACTION_FEE;
        if(checkUser(id) && isWithdrawAllowed(feeAmount)){
            withdraw(id, feeAmount);
            resetTransactions();
        }
    }
}
