package mygame.heroes;

public class polyphorsimsm {
    public static void main(String[] args) {
        BankAccount[] accounts = new BankAccount[3];

        accounts[0] = new SavingsAccount();
        accounts[1] = new CheckingAccount();
        accounts[2] = new BusinessAccount();

        for (BankAccount acc : accounts) {
            acc.accountType();
            acc.deposit(1000);
            acc.withdraw(500);
            System.out.println("Баланс: " + acc.balance);
            System.out.println();
        }
    }
}


class BankAccount {
    double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void accountType() {
        System.out.println("Generic account");
    }
}


class SavingsAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        System.out.println("Buy something from the cart");
        super.withdraw(amount);
    }

    @Override
    public void accountType() {
        System.out.println("Save balance");
    }
}


class CheckingAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        System.out.println("Spent money");
        super.withdraw(amount);
    }

    @Override
    public void accountType() {
        System.out.println("Current account");
    }
}


class BusinessAccount extends BankAccount {
    @Override
    public void withdraw(double amount) {
        System.out.println("Spend money from business account");
        super.withdraw(amount);
    }

    @Override
    public void accountType() {
        System.out.println("Business account");
    }
}
