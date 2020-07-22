package Moduk1.Lessone11.Lesson10;

public class Main {
    public static void main(String[] args){

        Square square =new Square(10);
        Circle circle = new Circle(10);

        Shape[] shapes={
                square,
                circle
        };
        for (int i=0; i<shapes.length; i++){
            shapes[i].printArea();
            shapes[i].printPerimetr();
        }
}
}
