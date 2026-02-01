package Oops;

// Balance is hidden (private) and accessed safely

abstract class Account implements BankAccount {

    private double balance;

    public Account(double initialBalance){

        if(initialBalance <0) throw new InvalidAmountException("Initial Balance cannot be negative");
        this.balance= initialBalance;
    }

    protected void setBalance(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return balance;
    }

    public void validateBalance(double amount){
        if(amount <0){
            throw new InsufficientBalanceException("Amount must be greate than zero");

        }
    }
}
