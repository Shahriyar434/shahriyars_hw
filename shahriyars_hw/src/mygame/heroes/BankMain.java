package mygame.heroes;

abstract class BankAccount {
    protected String accountHolder;
    protected double balance;

    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0;
    }

    public abstract void openAccount();

    public abstract void deposit(double amount);

    public void printInfo() {
        System.out.println("Name: " + this.accountHolder);
        System.out.println("Balanse: " + this.balance);
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountHolder) {
        super(accountHolder);
    }

    @Override
    public void openAccount() {
        System.out.println("Fond " + accountHolder);
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("For Fond: " + amount);
    }
}

class BusinessAccount extends BankAccount {

    public BusinessAccount(String accountHolder) {
        super(accountHolder);
    }

    @Override
    public void openAccount() {
        System.out.println("Buisnes balanse " + accountHolder);
    }

    @Override
    public void deposit(double amount) {
        double commission = amount * 0.02;
        balance = balance + (amount - commission);
        System.out.println("On buisnes balanse: " + (amount - commission) + " ( 2%)");
    }
}

public class BankMain {
    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount("Mateo");
        acc1.openAccount();
        acc1.deposit(1000);
        acc1.printInfo();

        System.out.println();

        BusinessAccount acc2 = new BusinessAccount("Qalya");
        acc2.openAccount();
        acc2.deposit(1000);
        acc2.printInfo();
    }
}
