package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingnsAccount;

public class Program {
    public static void main(String[] args) throws Exception {
        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(200.0);
        System.out.println(acc1.getBalance());

        Account acc2 = new SavingnsAccount(1002, "Veronica", 1000.0, 0.01);
        acc2.withdraw(200.0);
        System.out.println(acc2.getBalance());

        Account acc3 = new BusinessAccount(1003, "Rafael", 1000.00, 500.00);
        acc3.withdraw(200.00);
        System.out.println(acc3.getBalance());
    }
}
