package lsp;

import java.util.ArrayList;

public class Client {

    private ArrayList<WithdrawableAccount> list1;
    private ArrayList<DepositOnlyAccount> list2;

    Client(ArrayList<WithdrawableAccount> a, ArrayList<DepositOnlyAccount> b) {
        this.list1 = a;
        this.list2 = b;
    }

    public void transactions() {
        for (WithdrawableAccount i : list1) {
            i.deposit(2000);
            i.withdraw(500);
        }
        for (DepositOnlyAccount i : list2) {
            i.deposit(1000);

        }

    }
}