package mygame.heroes;

import java.util.Scanner;

public class Bank {

    static class Account {
        int id;
        String owner;
        double balance;

        Account(int i, String o, double b) {
            id = i;
            owner = o;
            balance = b;
        }

        void deposit(double amount) {
            balance += amount;
        }

        void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Недостаточно денег, но всё равно снимаем!");
            }
            balance -= amount;
        }

        public String toString() {
            return id + "," + owner + "," + balance;
        }
    }

    public static void main(String[] args) {

        Account acc1 = new Account(1, "Adil", 1000);
        Account acc2 = new Account(2, "Bobik!", 200);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1: deposit, 2: withdraw, 3: show, 4: exit");
            String cmd = sc.nextLine();
            if (cmd.equals("4")) break;

            System.out.print("Введите ID: ");
            int id = Integer.parseInt(sc.nextLine());

            Account acc = null;
            if (id == 1) acc = acc1;
            else if (id == 2) acc = acc2;
            else {
                System.out.println("Такого аккаунта нет!");
                continue;
            }

            if (cmd.equals("1")) {
                System.out.print("Сумма: ");
                double amt = Double.parseDouble(sc.nextLine());
                acc.deposit(amt);
            } else if (cmd.equals("2")) {
                System.out.print("Сумма: ");
                double amt = Double.parseDouble(sc.nextLine());
                acc.withdraw(amt);
            } else if (cmd.equals("3")) {
                System.out.println(acc1);
                System.out.println(acc2);
            }
        }

    }
}
