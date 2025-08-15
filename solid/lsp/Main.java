package lsp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<DepositOnlyAccount> list1 = new ArrayList<>();
        ArrayList<WithdrawableAccount> list2 = new ArrayList<>();

        list1.add(new FixedDeposit());

        list2.add(new CurrentAccount());
        list2.add(new SavingsAccount());

        Client vishal = new Client(list2, list1);
        vishal.transactions();

    }
}
