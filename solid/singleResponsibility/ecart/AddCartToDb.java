package singleResponsibility.ecart;

public class AddCartToDb {

    private ShopCart cart;

    AddCartToDb(ShopCart cart) {
        this.cart = cart;
    }

    public void addToDb() {
        System.out.println("Cart has saved to database");
        System.out.print(cart);
    }

}
