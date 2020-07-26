import java.util.Scanner;

public class Exceptiobclass {


    public static void first() {

        System.out.println("Enter any number");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("Enter Second number");
        int j = sc.nextInt();
        int k = 0;


        try {
            System.out.println(j = i / j);


            System.out.println("....STIL...COUNTINUE........");
        } catch (Exception e) {

            System.out.println(e);
        } finally {
            System.out.println("....BYE...BYE...BYE...");
            sc.close();
        }


    }

    public static void customExeption() {

        int i = 5;


        try {
            if (i < 10) {


                throw new myexceptionclass("gsfdhgsadhgfshdfwgdhjwgfyuwgdhyjw");
            }

        }catch (myexceptionclass e){

            System.out.println(e);
        }

    }

}

class myexceptionclass extends Exception{


    public myexceptionclass(String mag) {
        super(mag);
    }
}
