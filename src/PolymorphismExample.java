public class PolymorphismExample {

    public static void add() {

        System.out.print("\n print one 1");
    }

    public static void add(int i) {

        System.out.print("\n print one 2");
    }

    public static void add(int i, int j) {

        System.out.print("\n print three 3");
    }
}

class Overriding extends PolymorphismExample{


    public static void add(){

        System.out.print("\n\n\n\n RIght now we are in Overriding");
    }

}
