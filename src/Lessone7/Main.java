package Lessone7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        DBManager dbManager = new DBManager();
        dbManager.connect();
        ArrayList<Cars> cars = dbManager.getAllCars();
        
    }
}
