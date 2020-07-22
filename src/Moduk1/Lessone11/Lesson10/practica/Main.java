package Moduk1.Lessone11.Lesson10.practica;

public class Main {
    public static void main(String[] args){
        Firariengine f1=new Firariengine(100, 200, 300);
        Firariengine f2=new Firariengine(400, 200, 30);
        Firariengine f3=new Firariengine(500, 400, 300);
        Firariengine f4=new Firariengine(800, 300, 300);



        Renouldengine r1=new Renouldengine(100, 200, 300, 100);
        Renouldengine r2=new Renouldengine(400, 200, 30, 500);
        Renouldengine r3=new Renouldengine(500, 400, 300,0);
        Renouldengine r4=new Renouldengine(800, 300, 300, 1);


        Engine[] engines = {f1, f2, f3,f4, r1,r2,r3,r4};
        for(int i=0; i<engines.length;i++){
            System.out.println(engines[i].getMaxspeed());
        }

    }
}
