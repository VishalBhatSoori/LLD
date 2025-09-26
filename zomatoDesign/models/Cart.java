package zomatoDesign.models;

import java.util.ArrayList;

public class Cart {
    private Restaurant restaurant;
    private ArrayList<MenuItem> items = new ArrayList<>();

    public Cart() {
        restaurant = null;
    }

    // getters
    public Restaurant getRestaurant() {
        return restaurant;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    // setters
    public void setRestaurant(Restaurant r) {
        this.restaurant = r;
    }

    public void addMenuItems(MenuItem item) {
        if (restaurant == null) {
            System.out.println("You have not selected a restaurant, use setRestaurant first!!!");
            return;
        }
        items.add(item);
    }

    // other functions
    public void clear() {
        items.clear();
        restaurant = null;
    }

    public double getTotalPrice() {
        double price = 0;
        for (MenuItem m : items) {
            price += m.getPrice();
        }
        return price;
    }

    // just a function for timepass
    public boolean isEmpty() {
        return (restaurant == null || items.isEmpty());
    }
}
