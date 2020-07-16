import java.util.Random;

public class Arry {
    public static void arrydemo() {


        int a[] = new int[5];
        for (int i = 0; i < a.length; i++) {

            a[i] = i + 1;
        }
        for (int i : a) {

            System.out.println(i);
        }

    }

    public static void randomdemo() {

        Random r = new Random();

        int a[] = new int[20];

        for (int i = 0; i < a.length; i++) {

            a[i] = r.nextInt(50);
        }

        for (int i : a) {
            System.out.println(i);
        }


    }

    public static void exceptionhadlingdemo() {

        Random r = new Random();

        int a[] = new int[20];

        for (int i = 0; i < a.length; i++) {

            a[i] = r.nextInt(50);
        }

        try {
            System.out.println(a[45]);
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("maximun is 20");
        }


        for (int i : a) {
            System.out.println(i);
        }


    }

    public static void twodimentionary() {

        int[][] a = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                System.out.print(a[i][j]);
            }
            System.out.println("");
        }

        for (int q[]: a){

            for (int w : q){
                System.out.print(w);
            }System.out.println("");
        }

    }



}
