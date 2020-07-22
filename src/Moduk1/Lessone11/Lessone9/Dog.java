package Moduk1.Lessone11.Lessone9;

public class Dog extends Animal{
    String nicName;

    public Dog(String sound, String name, int weight, String nicName ){
        super(sound,name,weight);
        this.nicName=nicName;
    }
    public Dog(){
    }

    @Override
    public void say() {
        System.out.println("Name: "+ name+ "Says: "+sound + "nicName"+ nicName);
    }
    @Override
    public String toString(){
        return super.toString() +",nicName " + nicName;
    }
}
