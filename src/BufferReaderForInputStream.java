import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReaderForInputStream {

    public static void BBBBfuurreader() throws Exception  {


        System.out.println("Enter any number ");

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

          int n =Integer.parseInt(br.readLine());
          System.out.println(n);

    }

    public static void Bexample() throws IOException {



        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String s1 = br.readLine();
        System.out.println(s1);
    }

    public static void examleofscanner(){

        System.out.println("Scannre example");

        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        System.out.println(i);

    }


     public static void wrappweclass(){

        int i = 5;
        Integer intg = new Integer(i);
        System.out.println(intg);

        int j= intg.intValue();
         System.out.println(j);
Integer jj = i;   //autoboxing
         System.out.println(jj);

     }

     public static void splitstringmethod(){
        String sr = "keval,miyani,dhaval,jahanvi";

       String sarry[]= sr.split(",");

       for (String i: sarry){

           System.out.println(i);
       }


     }
     public static void stringbufferrrrr() {


          StringBuffer sb = new StringBuffer("keval");
           sb.append("miyani");
           System.out.println(sb);


           StringBuilder sbr = new StringBuilder("dhaval");
           sbr.append(" miyani");
           System.out.println(sbr);
    }

}
