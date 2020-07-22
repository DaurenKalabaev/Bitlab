package Moduk1.Lessone11.lesseon8;

public class Car {
    String name;
    String model;
    int speed;
    int weight;

    Car(){

    }
    public Car(String name, String model, int speed, int weight){
        this.name =name;
        this.model=model;
        this.speed=speed;
        this.weight=weight;
    }
    public void getInfo(){
        System.out.println(name);
        System.out.println(model);
        System.out.println(speed);
        System.out.println(weight);
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String getModel(){
        return model;
    }
    public void setModel(){
        this.model=model;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(){
        this.speed=speed;
    }
    public int getWeight(){
        return weight;
    }
    public void setWeight(){
        this.weight=weight;
    }

    public String toString(){
        return "Name;"+name+" Model:"+model+"Speed"+ speed+ "Weight:"+weight;
    }
}

