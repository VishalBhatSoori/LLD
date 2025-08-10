package singleResponsibility.ecart;

public class InvoicePrint {
    private ShopCart cart;

    InvoicePrint(ShopCart cart) {
        this.cart = cart;
    }

    public void printInvoice() {
        System.out.println("Look for the invoice below: ");
        for (Products p : cart.getProducts()) {
            System.out.println(p.name + "->" + p.price);
        }
        System.out.println("Total price =" + cart.calculatePrice());
    }

}
