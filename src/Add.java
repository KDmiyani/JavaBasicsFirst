public class Add {

    public static void math() {

        int a, j, k;
        a = 10;
        j = 12;
        k = a + j;
        System.out.println("hey there ");
        System.out.println("the addition of" + a + " and " + j + " is " + k);
        System.out.printf("the addition of %d and %d is %d", a, j, k);
    }

    //increment

    public static void increment() {

        int i = 5;
        i *= 2;
        System.out.println("increment is = " + i);

        byte b = 8;
        b *= 2.5;
        b = (byte) (b * 2.5);

    }


    public static void postpreyincrement() {
        int m = 5;
        System.out.println(m++);

        int n = 5;
        System.out.println(++n);

    }


    static void binary() {
        int i = 0B101;
        int j = 0B10100010010;
        System.out.printf(String.valueOf(i));
        System.out.printf(String.valueOf(j));


    }


}

