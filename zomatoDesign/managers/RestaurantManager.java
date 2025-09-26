package zomatoDesign.managers;

import java.util.ArrayList;

import zomatoDesign.models.Restaurant;

public class RestaurantManager {

    private ArrayList<Restaurant> restaurants = new ArrayList<>();
    private static RestaurantManager instance;

    private RestaurantManager() {

    }

    public static RestaurantManager getInstance() {
        if (instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }

    public void addRestaurant(Restaurant r) {
        restaurants.add(r);
    }

    public ArrayList<Restaurant> searchByLocation(String loc) {
        ArrayList<Restaurant> reqList = new ArrayList<>();
        loc = loc.toLowerCase();
        for (Restaurant r : restaurants) {
            String r1 = r.getLocation().toLowerCase();
            if (r1.equals(loc)) {
                reqList.add(r);
            }
        }
        return reqList;
    }
}
