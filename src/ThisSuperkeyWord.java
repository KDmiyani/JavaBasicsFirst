public class ThisSuperkeyWord {

public  ThisSuperkeyWord (){}

    int x;
    public ThisSuperkeyWord(int x){

        this.x=x;
        System.out.print("\n"+x);

    }

    public static void finalexample(){



        int i= 5;

        System.out.print(i);

        final int j= 5;
         //j= 10;  cannot change
        System.out.print(j);


    }
    public void abc(){

        System.out.print("hello");
    }
    public void abcd(){

        System.out.println("hello   abcd");
    }


    public static void anomouse(){


        ThisSuperkeyWord obj = new ThisSuperkeyWord();
        obj.abc();
        new ThisSuperkeyWord().abcd();


    }
}

