public class Contoller {


    public static void ifelse() {
        int a = 5, b = 6, c = 10;
        if (a % 2 == 0) {

            System.out.println("EVEN");
        } else {
            System.out.println("odd");
        }

        if (a > b && a > c) {
            System.out.println("a is bigger");
        } else if (b > c) {
            System.out.println("B is bigger");
        } else {
            System.out.println("c is bigger");
        }
    }

    public static void swichcase() {
        int i = 2;

        switch (i) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;

            default:
                System.out.println("unknown number ");

        }
    }

    public static void ternaryoperator() {

        int i = 4, j = 7;

        j = i == 1 ? 6 : 7;
        System.out.println(j);
    }


    public static void forloop() {


        for (int i = 0; i <= 10; i++) {

            System.out.println("this is FOR loop" + i);
        }
        int j = 1;
        while (j <= 5) {

            System.out.println("this is whilke loop " + j);
            j++;
        }
        
        int k = 0;
        do {
            System.out.println("this is DO WHILE LOOP"+ k );
            k++;
        }while (k <= 10);
    }

}
