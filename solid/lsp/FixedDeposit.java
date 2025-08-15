package lsp;

public class FixedDeposit implements DepositOnlyAccount {

    private double balance;

    FixedDeposit() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(amount + " has been added to your balance in FD");
        System.out.println("The current balance in fixed deposit is: " + getBalance());
    }

    public double getBalance() {
        return balance;
    }
}
