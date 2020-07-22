package Try;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    User[] users = new User[5];
    for (int i=0; i<5; i++){

        User user = null;
        try {
        String name = in.next();
        String surname = in.next();
        int age = in.nextInt();

        new User(name, surname, age);

        }catch (Exception e){
            user = new User("", "", 0);
            e.printStackTrace();
        }
        users[i]=user;
    }
    for (int i=0; i<5; i++){
        System.out.println(users[i]);
    }

    }
}
