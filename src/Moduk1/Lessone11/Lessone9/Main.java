package Moduk1.Lessone11.Lessone9;

public class Main {
    public static void main(String[] agrs) {
//        Cat cat = new Cat("miau ", "Barsik ", 4, 10);
//        Dog dog = new Dog("gav ", "Aktos ", 5, " Rex");


        Animal[] animals = {
                new Cat("miau ", "Barsik ", 4, 10),
                new Dog("gav ", "Aktos ", 5, " Rex"),
                new Mouse()
        };
        for (int i=0; i<animals.length; i++){
           System.out.println( animals[i].toString());
        }
    }
}
