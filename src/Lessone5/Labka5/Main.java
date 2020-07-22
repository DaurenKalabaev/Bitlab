//package Lessone5.Labka5;
//
//import Lessone5.User;
//
//import java.io.FileOutputStream;
//import java.io.ObjectOutputStream;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Main {
//    static ArrayList<Players> players = new ArrayList<>();
//    static ArrayList<Game> games = new ArrayList<>();
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        public static void saveGame(Game game1){
//            try{
//
//                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("settings.data"));
//                games.add(game1);
//                outputStream.writeObject(games);
//                outputStream.close();
//
//            }catch (Exception e){
//                e.printStackTrace();
//
//
//        public static void addPlayers(Players players){
//            try {
//                ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("settings.data"));
//                players= (ArrayList<Players>)inputStream.readObject();
//
//
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
//}
//
