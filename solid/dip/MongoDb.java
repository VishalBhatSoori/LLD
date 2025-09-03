package dip;

public class MongoDb implements Database {
    public void save(String user) {
        System.out.println("The " + user + " has been stored in MongoDb database successfully");
    }
}
