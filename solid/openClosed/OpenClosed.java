package openClosed;

public class OpenClosed {
    public static void main(String[]args){
        Shape rectangle = new Rectangle(4,5);
        int areaOfRect=rectangle.calculateArea();
        System.out.println(areaOfRect);
        int periOfRect = rectangle.calcualtePerimeter();
        System.out.println(periOfRect);

        Shape circle = new Circle(5);
        int areaOfCircle=circle.calculateArea();
        System.out.println(areaOfCircle);
        int periOfCircle=circle.calcualtePerimeter();
        System.out.println(periOfCircle);
    }
}
