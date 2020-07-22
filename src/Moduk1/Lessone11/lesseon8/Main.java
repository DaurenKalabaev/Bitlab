package Moduk1.Lessone11.lesseon8;

public class Main {
    public static void main(String[] args){
//        Human human = new Human("Dauren", "Kalabaev" , 20 , true);
//        Human human2 = new Human("Askar", "datkambek", 25, true);
//
//
//
//        human.setName("jasBala");
//        String name = human.getName();
//
//        System.out.println(name);
//        human.getinfo();
       Car[] cars = {
               new Car("tesla","s",200,900),
               new Car("tesla","x",250,700),
               new Car("tesla", "y",240,900),

       };
       for (int i=0;i< cars.length;i++){
           System.out.println(cars[i].toString());
       }


    }
}
