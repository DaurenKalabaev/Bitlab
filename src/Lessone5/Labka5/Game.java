package Lessone5.Labka5;

import java.io.Serializable;

public class Game implements Serializable {
    private String gameName;
    private String ipAddress;
    private int port;
   // private ArrayList<Players> players = new ArrayList<Players>();


    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    //public ArrayList<Players> getPlayers() {
        //return players;
    //}
//
//    public void setPlayers(ArrayList<Players> players) {
//        this.players = players;
//    }
}
