package dip;

public class SQLdb implements Database {
    public void save(String user) {
        System.out.println("The " + user + " has been added to sqldb");
    }
}
