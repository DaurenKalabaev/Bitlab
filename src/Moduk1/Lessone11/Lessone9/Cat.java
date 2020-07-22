package Moduk1.Lessone11.Lessone9;

public class Cat extends Animal {
    int mou;

    public Cat(String sound, String name, int weight, int mou ){
        super(sound, name, weight);
        this.mou=mou;

    }
    public Cat(){

    }

    @Override
    public void say() {
        System.out.println(" Name: "+ name+ " Says: "+sound+ " Mous "+ mou);
    }
    @Override
    public String toString(){
        return super.toString() + ", mou"+ mou;
    }
}
