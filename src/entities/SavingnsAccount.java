package entities;

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

    public void updateBalance() {
        balance = (balance * interesRate) + balance;
    }

}
