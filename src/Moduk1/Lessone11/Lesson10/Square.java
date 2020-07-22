package Moduk1.Lessone11.Lesson10;

public class Square extends Shape {
    double width;

    public Square(){

    }
    public Square(double width){
        this.width=width;
    }
    public double getPerimetr() {
        return 4*width;
    }

    @Override
    public double getArea() {
        return width*width;
    }
}


