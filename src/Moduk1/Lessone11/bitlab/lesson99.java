package Moduk1.Lessone11.bitlab;
import java.util.Scanner;

public class lesson99 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s =in.nextInt();
        int [][] syn = new int [s][s];

        for (int i=0; i<s; i++){
            for (int j=0; j<s; j++ ){
                syn[i][j]=in.nextInt();
            }
        }

        for (int i=0; i<s; i++){
            for (int j=0;j<s;j++){
                System.out.print("* ");
            }System.out.println();
        }

    }
}
