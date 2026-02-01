package Oops;

public class CurrentAccount extends Account {

    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    public void deposit(double amount) {
        validateBalance(amount);
        setBalance(getBalance() + amount);
        System.out.println("Deposited in current : " + amount);
    }

    public void withdraw(double amount) {
        //Current account allows overdraft
        validateBalance(amount);
        setBalance(getBalance() - amount);
        System.out.println("withdraw from Current: " + amount);
    }

}
