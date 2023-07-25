package entities;

public class BusinessAccount extends Account {
    private Double loanLimite;

    public BusinessAccount() {
        // e para executar a logica do construtor da classe base

        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimite) {
        super(number, holder, balance);
        this.loanLimite = loanLimite;
    }

    public Double getLoanLimite() {
        return loanLimite;
    }

    public void setLoanLimite(Double loanLimite) {
        this.loanLimite = loanLimite;
    }

    public void loan(double amount) {
        if (amount <= loanLimite) {
            // Não esta reconhecendo pq o balance esta como privado
            balance = balance - 10.0;
        }
    }

}
