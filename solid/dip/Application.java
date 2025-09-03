package dip;

public class Application {
    private Database db;

    Application(Database database) {
        this.db = database;
    }

    public void storeUser(String user) {
        db.save(user);
    }
}
