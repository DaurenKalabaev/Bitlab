package Moduk1.Lessone11.Lessone9;

public class Animal {
    String sound;
    String name;
    int weight;


    public Animal(String sound,String name,int weight){
        this.name=name;
        this.sound=sound;
        this.weight=weight;
    }

    public Animal(){
    }


    public void say(){
        System.out.println("Name: "+ name+ "Says: "+sound);
    }


}
