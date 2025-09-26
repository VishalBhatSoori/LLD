package zomatoDesign.models;

public class MenuItem {
    private String menuId;
    private String name;
    private double price;

    public MenuItem(String menuId, String name, double price) {
        this.menuId = menuId;
        this.name = name;
        this.price = price;
    }

    // getters
    public String getMenuId() {
        return menuId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // setters
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
