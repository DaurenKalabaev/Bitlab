package Moduk1.Lessone11.Lesson10.Labka;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println(" press [1] to add user");
            System.out.println(" press [2] to list users");
            System.out.println(" press [0] to exit");



            int choice1 = in.nextInt();

            if (choice1==1){
                System.out.println("press [1] to add student");
                System.out.println("press [2] to add teacher");

                int choice2 = in.nextInt();
                if (choice2==1){
                    System.out.println("login");
                    String login=in.next();
                    System.out.println("password");
                    String password=in.next();
                    System.out.println("Name");
                    String Name=in.next();
                    System.out.println("Surname");
                    String Surname=in.next();
                    System.out.println("Group");
                    String group=in.next();
                    System.out.println("Gpa");
                   double gpa=in.nextDouble();

                   //Student student =new Student(login, password, group,gpa )
                }


            }else if (choice1==2){

            }else {
                break;
            }
        }

    }
}
