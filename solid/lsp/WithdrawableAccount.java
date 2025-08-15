package lsp;

public interface WithdrawableAccount extends DepositOnlyAccount {
    void withdraw(double amount);
}
