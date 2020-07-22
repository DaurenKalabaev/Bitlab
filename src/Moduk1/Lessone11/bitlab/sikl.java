package Moduk1.Lessone11.bitlab;
import java.util.Scanner;
public class sikl {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//
//       for (int i =1; i<5; i++){
//           System.out.println(i);
//       }
//
//        int a = in.nextInt();
//        for (int i =8; i>0; i--) System.out.println(i);

//        int b = in.nextInt();
//        for (int i=1; i<=10; i++){
//            System.out.println( b+ " *"+  i +" = " + b*i);
//        }

//        int san = in.nextInt();//tolko dlya vvyvoda sifr
//        int sum =0;
//        for (int i =1; i<=san; i++){
//            sum = sum+i;
//        }System.out.println(sum);

//        int a= in.nextInt();//1dz
//        int d=1;
//        for (int i =1; i<=a; i++){
//            d=d*i;
//        }System.out.println(d);

//        int a=in.nextInt();//3dz
//        int d=2;
//        int s=0;
//        for (int i=1; i<a; i++){
//          if (i==i/d){
//              s=s+i;
//              System.out.println(s);
//          }else System.out.println("nathing");
//        }
//        //System.out.println(d);


//        int d=in.nextInt();
//        int g=1;
//        int w=0;
//        int f=0;
//        for (int i=0; i<d; i++){
//            w=1+1;
//            f=w/i+g;
//        }
//        System.out.println(f);
        //nujni uslovia IF


//        System.out.println("a");
//        int p=in.nextInt();
//        System.out.println("b");
//        int f=in.nextInt();
//
//        int result=1;
//        for (int i=1; i<=f;i++){
//            result=result * p;
//
//        }System.out.println(result);

//        //massiv
//        int n = in.nextInt();
//        int mass[] = new int[n];
//        for (int i =0; i<mass.length;i++){
//            mass[i]=in.nextInt();
//        }for (int i =mass.length-1; i>0; i-- )
//            System.out.print(mass[i]+" ");

//        int n = in.nextInt();
//        int sum[] = new int[n];
//        //boolean b = true;
//
//        for (int i = 0; i < sum.length; i++) {
//            sum[i] = in.nextInt();
//        }
//        for (int i = 0; i < sum.length; i++) {
//         System.out.println(sum[i]);
//        }
//        for (int i =0; i<sum.length; i++) {
//            if (sum[i] > 0){
//                System.out.print(sum[i] + " ");
//            }
//        }


        //2dz massiv
//        int a = in.nextInt();
//        int[] n = new int[a];
//        for (int i =0; i<n.length; i++){
//            n[i]=in.nextInt();
//        }for (int i = 0; i<n.length; i++){
//            int t=0;
//        }
        //3dz massiv
//        int a = in.nextInt();
//        int[] n = new int[a];
//        int sum =1;
//        for (int i =0; i<n.length; i++) {
//            n[i] = in.nextInt();
//        }
//        for (int i =0; i<n.length;i++){
//            sum=sum*n[i];
//        }
//        System.out.println(sum);
//        //0 не нужно гужно условия if

//        int j = in.nextInt();//6dz
//        int[] a = new int[j];
//        int summa = 0;
//        boolean b = true;
//        for (int i = 0; i < a.length; i++) {
//            a[i] = in.nextInt();
//        }
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > 0 && a[i] < 0) {
//                summa = summa + a[i];
//                System.out.println(summa);
//            } else System.out.println("no");
//
//
//        }

        //String klass
        //1dz
//        String s =in.nextLine();
//        boolean b =false;
//        for (int i=0; i<s.length(); i++){
//
//            if (s.charAt(i)== ' '){
//                if (s.charAt(i+1)>64 && s.charAt(i+1)<91) b =true;
//                else b =false;
//            }
//            if (b){
//                if ((s.charAt(i)>64 && s.charAt(i)<91) || (s.charAt(i)>94 && s.charAt(i)<123)|| s.charAt(i)==32){
//                    System.out.print(s.charAt(i));
//                }
//            }
//        }

//        String s = in.nextLine();
//        boolean b = false;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i)== ' '){
//                if (s.charAt(i+1)>64 && s.charAt(i+1)<91) b =true;
//                else b =false;
//            }
//        }

        //dvainoi massiv
//        int [][] arrey = new int [3][3];
//        for (int i =0; i<3; i++){
//            for (int j=0;j<3;j++){
//                arrey[i][j]=in.nextInt();
//            }
//        }
//
//
//        for (int i =0;i<3; i++){
//            for(int j=0; j<3; j++){
//                System.out.print(arrey[i][j]+ " ");
//            }System.out.println();
//        }
//        int n =in.nextInt();
//
//        for (int i=1;i<=n; i++ ){
//            for (int j=0; j<i; i++){
//                System.out.print("* ");
//            }System.out.print();
//        }


        //dla piramid
//        int n = in.nextInt();
//        for (int i =1; i<=n; i++){
//            for (int j =0; j<i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        int n = in.nextInt();
//        int[][] arrey = new int [2][n];
//
//        for (int i =0; i<2; i++){
//            for (int j = 0; j<n; j++ ){
//                arrey[i][j]=in.nextInt();
//            }
//        }
//        boolean b =true;
//        for (int i =0; i<n; i++){
//            int x =0;
//            for (int j =0; j<2; j++ ){
//                if(j==0){
//                   x =arrey[i][j];
//                }else{
//                    if (x==arrey[j][i]){
//                        b= true;
//                    }else{
//                        b = false;
//                        break;
//                    }
//                }
//            }if(b){
//                break;
//            }
//        }
//        if (b){
//            System.out.println("yes");
//        }else System.out.println("nooooo");

        //1dz po 2massiv

//        int n = in.nextInt();
//        int m = in.nextInt();
//        int [][] arrey = new int [n][m];
//        for (int i =0; i<n; i++){
//            for (int j=0;j<m;j++){
//                arrey[i][j]=in.nextInt();
//            }
//        }
//        for (int i =0; i<n; i++){
//            for(int j =0; j<m; j++){
//                if(arrey[i][j]>0 ) {
//                    System.out.print(arrey[i][j]);
//                }
//            }System.out.println();
//        } // mne nujno naiti ewe samy max nujno usilit uslovi IF
//        //2 3
//        //0 -2 3
//        //-5 8 -8 с этим нет проблем но когдаа другии цифры то код  не работате


        //это 2дз по 2массив
//        int n =in.nextInt();
//        int [][] arrey = new int [n][n];
//        for (int i=0; i<n; i++){
//            for (int j=0; j<n; j++){
//                arrey[i][j]=in.nextInt();
//            }
//        }
//
//        int p=0;
//        for (int i=0; i<n; i++){
//            for (int j =0; j<n; j++){
//                if (arrey[i][j]==arrey[j][i]){
//                    System.out.println("x");
//                }
//                System.out.print(arrey[i][j]+" ");
//            }System.out.println();
//        }
        int n =in.nextInt();
        int [][] arrey =new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n;j++){
                arrey[i][j]=in.nextInt();
            }
        }
        for (int j=0;j<n;j++){
            for (int i=0; i<n;i++){
                System.out.print(arrey[i][j]);
            }System.out.println();
        }//это 3дз по 2массив







    }
}