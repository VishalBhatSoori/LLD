package zomatoDesign.models;

import java.util.ArrayList;

public class Restaurant {
    private static int restaurantIdCounter = 0;
    private int restaurantId;
    private String name;
    private String location;
    private ArrayList<MenuItem> menu = new ArrayList<>();

    public Restaurant(String name, String location) {
        this.name = name;
        this.location = location;
        this.restaurantId = restaurantIdCounter++;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }

}
