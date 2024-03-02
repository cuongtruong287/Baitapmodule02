package Demo04;

public class PersonAccount extends Account {
    private double fee;

    public PersonAccount(int accountNo, String customerName, double balance) {
        super(accountNo, customerName, balance);
    }

    public PersonAccount(int accountNo, String customerName, double balance, double fee) {
        super(accountNo, customerName, balance);
        this.fee = fee;
    }

    public double getFee() {
        return (double) fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return super.toString() + ", fee: " + fee;
    }

    public void withDraw(double m) {
        setBalance(getBalance() - m - fee);
    }

    public void deposite(double m) {
        setBalance(getBalance() + m - fee);
    }


}
