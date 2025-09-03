package dip;

public class Main {
    public static void main(String[] args) {
        SQLdb sql = new SQLdb();
        MongoDb mdb = new MongoDb();

        Application app1 = new Application(sql);
        Application app2 = new Application(mdb);

        app1.storeUser("Vishal");
        app2.storeUser("Vrajesh and Hs");
    }

}
