import java.util.Scanner;

public class StringOperation {
    int id;
    String nAME;

    public StringOperation(int id, String nAME) {
        this.id = id;
        this.nAME = nAME;
    }
    public String toString() {
        return id+" : "+nAME;
    }

    public static void stringconcat() {

        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        s1 = sc.nextLine();

        System.out.println("Enter second string");
        s2 = sc.nextLine();


        String s3 = s1.concat(s2);
        String s4= s1+s2;
        System.out.println("Result of concat -> "+s3);
        System.out.println("Result of concat -> "+s4);

    }

    public static  void  stringlength(){
        String s1, s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        s1 = sc.nextLine();

        System.out.println("Enter second string");
        s2 = sc.nextLine();

        int i = s1.length();
        int j = s2.length();

        System.out.println("length pof both String  => "+i+" "+j);



    }

      static void stringUppercase(){
        String s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        s1 = sc.nextLine();

       s1 = s1.toUpperCase();
        System.out.println("upper case string => "+ s1);

    }




    //Scanner and Bufferreader




}
