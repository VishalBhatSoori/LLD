package isp;

public class Main {
    public static void main(String[] args) {
        Square sq1 = new Square(10);
        sq1.area();
        Rectangle r1 = new Rectangle(10, 20);
        r1.area();
        Cube c1 = new Cube(10);
        c1.area();
        c1.volume();
    }
}
