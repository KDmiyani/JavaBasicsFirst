public class InheritenceExample {

    static int a, b, c;

    public InheritenceExample() {

        System.out.print("\nIn Constructor Super Class");
    }

    public static void add(int i, int j) {
        a = i;
        b = j;

        System.out.print("\n\n\n\n" + (a + b));
    }

}


class B extends InheritenceExample {


    public B() {
        super();
        System.out.print("\nIN Constructor B");
    }

    public B(int a) {
        System.out.print("\nIN Constructor B");
    }


    public static void sum() {

        System.out.print("dhaval");
    }

}
