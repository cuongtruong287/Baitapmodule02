package Demo04;

import java.util.Scanner;

public class SavingAccount extends Account {
    private int period;
    private double rate;

    public SavingAccount(int accountNo, String customerName, double balance) {
        super(accountNo, customerName, balance);
    }

    public SavingAccount(int accountNo, String customerName, double balance, int period, double rate) {
        super(accountNo, customerName, balance);
        this.period = period;
        this.rate = rate;
    }

    public int getPeriod() {
        return (int) period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public double getRate(int period) {
        if (period <= 1) {
            return 5.0;
        }
        if (period <= 3) {
            return 5.5;
        }
        if (period <= 6) {
            return 6;
        }
        if (period <= 12) {
            return 7;
        }
        if (period <= 24) {
            return 7.5;
        }
        if (period <= 36) {
            return 8;
        } else {
            return 1.8;
        }
    }

    public void setRate() {
        this.rate = rate;
    }

    public double showRate() {
        return getRate(period);
    }

    @Override
    public String toString() {
        return super.toString() + ", rate: " + rate + ", period: " + period;
    }

    public double checkInterest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ky han ban muon gui:");
        int period1 = scanner.nextInt();
        double rate1 = getRate(period1);
        System.out.println("Lai suat theo ky han la: " + rate1);
        double interset = getBalance() * period1 * rate1 / 100;
        System.out.print("Tien lai theo ky han vua nhap la: ");
        return interset;
    }

}
