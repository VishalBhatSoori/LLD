package singleResponsibility.ecart;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Products> itemsToAdd = new ArrayList<>();
        itemsToAdd.add(new Products("Laptop", 998777.6));
        itemsToAdd.add(new Products("Keyboard", 5500.0));
        itemsToAdd.add(new Products("Mouse", 2500.0));
        itemsToAdd.add(new Products("Monitor", 25000.0));
        itemsToAdd.add(new Products("Webcam", 8000.0));

        ShopCart myCart = new ShopCart();

        for (Products product : itemsToAdd) {
            myCart.addProduct(product);
        }

        InvoicePrint generateMyInvoice = new InvoicePrint(myCart);
        generateMyInvoice.printInvoice();

        AddCartToDb addCart = new AddCartToDb(myCart);
        addCart.addToDb();

    }
}
