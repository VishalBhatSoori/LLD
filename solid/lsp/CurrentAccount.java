package lsp;

public class CurrentAccount implements WithdrawableAccount {
    private double balance;

    CurrentAccount() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(amount + " has been added to your balance in CurrentAccount");
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("The balance in the account is insufficient for the amount you are requesting ");
        } else {
            this.balance -= amount;
            System.out
                    .println("The " + amount + " has been deducted from your account, please view your balance below");
            System.out.println("Your current balance is " + getBalance());
        }
    }
}