package openClosed;

public class Rectangle extends Shape {
    int width;
    int length;

    Rectangle(){
        System.out.println("Set the lenght and width of the rectangle by providing arguments width and lenght respectively in the constructor");
        this.width=1;
        this.length=1;
    }

    Rectangle(int width,int length){
        this.width=width;
        this.length=length;
    }

    int calculateArea(){
        return this.width*this.length;
    }
    int calcualtePerimeter(){
        return 2*(this.width+this.length);
    }


}
