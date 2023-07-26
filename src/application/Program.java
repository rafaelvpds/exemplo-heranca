package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingnsAccount;

public class Program {
    public static void main(String[] args) throws Exception {
        // Tem todos os atributos e metodos da classe Account
        // BusinessAccount account = new BusinessAccount();

        Account acc = new Account(1001, "Rafael", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Veronica", 0.0, 500.00);

        // UPCASTING
        Account acc1 = bacc;
        // Atribuindo um valor da subclasse para uma variavel da Super Classe
        Account acc2 = new BusinessAccount(1003, "Pereira", 0.0, 200.0);
        Account acc3 = new SavingnsAccount(1004, "Carvalho", 0.0, 0.01);

        // DowCasting

        // converter um objeto da SuperCalasse para a subclasse
        // para força a conversao e nescessario inndicar o tipo
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100);
        // Operação nao e permitida pois um BusinessAccount nao É um SavingAccount
        // BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount) {
            // esse if falhou ja que o acc3 nao e instancia de BusinessAccount
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingnsAccount) {
            SavingnsAccount acc5 = (SavingnsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

    }
}
