package isp;

public class Cube implements ThreeDShape {

    private double length;

    Cube() {
        this.length = 0;
    }

    Cube(double length) {
        this.length = length;
    }

    public void area() {
        System.out.println("The total surface area of the cube is " + this.length * this.length * 6);
    }

    @Override
    public void volume() {
        System.out.println("The total volume of the cube is " + this.length * this.length * this.length);
    }
}
