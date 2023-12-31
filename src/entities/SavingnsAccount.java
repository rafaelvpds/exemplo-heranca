package entities;

//Palavra final => evita que a classe seja herdada
public class SavingnsAccount extends Account {
    private Double interesRate;

    public SavingnsAccount() {
        super();
    }

    public SavingnsAccount(Integer number, String holder, Double balance, Double interesRate) {
        super(number, holder, balance);
        this.interesRate = interesRate;
    }

    public Double getInteresRate() {
        return interesRate;
    }

    public void setInteresRate(Double interesRate) {
        this.interesRate = interesRate;
    }

    // no metodo => evita que o metodo sob seja sobreposto
    public void updateBalance() {
        balance = (balance * interesRate) + balance;
    }

    // posso reemplementar um metodo, isso pode ser util para dar um comportamento
    // expecifico para uma classe
    @Override
    public final void withdraw(double amount) {
        this.balance = this.balance - amount;
    }
}
