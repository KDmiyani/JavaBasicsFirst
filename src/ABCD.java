import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABCD {

    int name,lastname;

    public ABCD(int name, int lastname) {
        this.name = name;
        this.lastname = lastname;

        System.out.println(name+"  : "+lastname);
    }


    public void print(){

        System.out.print("\nhelloooooo keval");
    }
}

class XYZ extends ABCD{




    public XYZ(int name, int lastname) {
        super(name, lastname);
        System.out.println(name+"  : "+lastname);
    }

    public void childprint(){

        System.out.print("\n keval child object");
    }




     static  void demotakeinput() throws IOException {



         System.out.println("enter any input");
         InputStreamReader insr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(insr);



         System.out.println(br.readLine());
     }
}
