package Oops;

public class BankApplication {
    public static void main(String[] args){
        BankAccount saving = new SavingsAccount(5000);
        BankAccount current= new CurrentAccount(10000);

        BankAccount account = new SavingsAccount(5000);

        saving.deposit(2000);
        saving.withdraw(3000);

        System.out.println("Saving account balance : "+ saving.getBalance());
        System.out.println("---------------------------");


        current.deposit(5000);
        current.withdraw(18000);
        System.out.println("Current account balance : "+ current.getBalance());
        System.out.println("----------------------------------");



        try{
            account.deposit(2000);
            account.withdraw(9000); // will throw exception

        }catch(InvalidAmountException | InsufficientBalanceException ex){
            System.out.println("Error : "+ ex.getMessage());
        }
        System.out.println("----------------------------------");

        Employee emp = new Employee();
        emp.setId(1001);
        emp.setName("Pramod Lohra");
        System.out.println("Employee Id : " + emp.getId());
        System.out.println("Employee Name : " + emp.getName());

    }
}
