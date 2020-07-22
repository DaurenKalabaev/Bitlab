package Moduk1.Lessone11.Lesson10;

public abstract class Shape {

    abstract public double getPerimetr();
    abstract public double getArea();

    public void printArea(){
        System.out.println(getArea());
    }

    public void printPerimetr(){
        System.out.println(getPerimetr());
    }
}
