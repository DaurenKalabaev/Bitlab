package Moduk1.Lessone11.bitlab;

public class lesson8 {

    public static void main(String[] args) {
    int[] num={1,2,3,4,5,6};
    printsum(num);
    int p =printsum(1,2,3);
    System.out.println(p);
    }

//    public static int printsum(int a,  int b, String name){
//        System.out.println(name);
//        return a+b ;
//    }
    public static void printsum(int []arrey){
        int sum=0;
        for (int i=0; i<arrey.length;i++){
            sum+=arrey[i];
        }System.out.println(sum);
    }
    public static int printsum(int a, int b, int c){
        return a+b+c;
    }

    }


