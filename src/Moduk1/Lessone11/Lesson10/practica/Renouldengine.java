package Moduk1.Lessone11.Lesson10.practica;

public class Renouldengine extends Engine {

    private double extraTurbaEnergy;

    public Renouldengine(){

    }
    public Renouldengine(double engineVolume, int cylinderAmount, double engineWeight, double extraTurbaEnergy){
        super(engineVolume, cylinderAmount, engineWeight);
        this.extraTurbaEnergy=extraTurbaEnergy;
    }




    @Override
    public double efficiency() {
        return 0.27;
    }

    @Override
    public double throttleEnergy() {
        return getEngineVolume()*getCylinderAmount()*100+extraTurbaEnergy;
    }

    @Override
    public double breakEnergy() {
        return getEngineWeight()*2.1 ;
    }

    public double getExtraTurbaEnergy() {
        return extraTurbaEnergy;
    }

    public void setExtraTurbaEnergy(double extraTurbaEnergy) {
        this.extraTurbaEnergy = extraTurbaEnergy;
    }
}
