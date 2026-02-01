package Oops;

class SavingsAccount extends Account {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);

    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited in savings: " + amount);
    }



    // Saving account with validation

    public void withdraw(double amount) {
        validateBalance(amount);
        if(amount > getBalance()){
            throw new InsufficientBalanceException("Insufficient balance in saving account");

        }
        setBalance(getBalance()- amount);
    }

}
