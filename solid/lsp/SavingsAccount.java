package lsp;

public class SavingsAccount implements WithdrawableAccount {

    private double balance;

    SavingsAccount() {
        this.balance = 0;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("The amount deposited to the savings account is " + amount);
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("There is not sufficient balance in the account");
        } else {
            this.balance -= amount;
            System.out
                    .println("The " + amount + " has been withdrawn from the account, kindly check your balance below");
            System.out.println(getBalance());
        }
    }
}
