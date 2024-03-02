package Demo04;

public class Account {
    private int accountNo;
    private String customerName;
    private double balance;

    public Account() {
    }

    public Account(int accountNo, String customerName, double balance) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.balance = balance;
    }

    public int getAccountNo() {

        return accountNo;
    }

    public void setAccountNo(int accountNo) {

        this.accountNo = accountNo;
    }

    public String getCustomerName() {

        return customerName;
    }

    public void setCustomerName(String customerName) {

        this.customerName = customerName;
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "So tai khoan: " + accountNo
                + ", ten khach hang: " + customerName
                + ", so du: " + balance;
    }
}

