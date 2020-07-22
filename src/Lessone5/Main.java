package Lessone5;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static  ArrayList<User> users = new ArrayList<>();
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        readUsers();

        while (true){
            System.out.println("[1] add user");
            System.out.println("[2] list users");
            System.out.println("[0] exit");

            int choice = in.nextInt();
            if (choice==1){

                System.out.println("vedite id");
                int id =in.nextInt();
                System.out.println("vedite username");
                String username =in.next();
                System.out.println("vedite parol");
                String password =in.next();
                System.out.println("vedite age");
                int age = in.nextInt();
                User user = new User(id, username, password, age);

                writeUser(user);
            }else if (choice==2){
                for (User u:users){
                    System.out.println(u);
                }
            }else {
                break;
            }

        }



    }

    public static void writeUser(User user){
        try{

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("input.txt"));
            users.add(user);
            outputStream.writeObject(users);
            outputStream.close();

        }catch (Exception e){
            e.printStackTrace();

        }
    }
    public static void readUsers(){
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("input.txt"));
            users = (ArrayList<User>)inputStream.readObject();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
