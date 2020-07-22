package Moduk1.Lessone11.Lesson10.practica;

public class Firariengine extends Engine {



    public Firariengine(){

    }


    public Firariengine(double engineVolume, int cylinderAmount, double engineWeight){
        super(engineVolume, cylinderAmount, engineWeight);
    }

    @Override
    public double efficiency() {
        return 0.25;
    }

    @Override
    public double throttleEnergy() {
        return getEngineVolume()*getCylinderAmount()*100;
    }

    @Override
    public double breakEnergy() {
        return getEngineWeight()*2;
    }
}
