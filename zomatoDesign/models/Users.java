package zomatoDesign.models;

public class Users {
    private int userId;
    private String name;
    private String userAddress;
    private Cart cart;

    public Users(int userId, String name, String address) {
        this.userId = userId;
        this.name = name;
        this.userAddress = address;
        this.cart = new Cart();
    }

    // getters
    public String getName() {
        return name;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public Cart getCart() {
        return cart;
    }

    public int getUserId() {
        return userId;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setUserAddress(String addr) {
        this.userAddress = addr;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
