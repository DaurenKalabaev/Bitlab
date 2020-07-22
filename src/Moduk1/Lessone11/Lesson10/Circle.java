package Moduk1.Lessone11.Lesson10;

public class Circle extends Shape{

    double redius;

    public Circle(){

    }
    public Circle(int redius){
        this.redius=redius;
    }

    @Override
    public double getPerimetr() {
        return 3.14*2*redius;
    }

    @Override
    public double getArea() {
        return 3.14*redius*redius;
    }
}
