package openClosed;

public class Circle extends Shape {
    int radius;
    int pi=3;
    Circle(){
        System.out.println("Pass the radius of the circle as an argument to the constructor");
        this.radius=1;
    }

    Circle(int radius){
        this.radius=radius;
    }

    int calculateArea(){
        return this.pi*this.radius*this.radius;
    }

    int calcualtePerimeter(){
        return 2*this.pi*radius;
    }
}
