public class Pattern {

    public static void pattern() {


        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("* ");

            }
            System.out.println("");
        }
    }

    public static void pattern1() {
        int a = 0;

        for (int i = 0; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.printf("%d", a);


            }
            a++;
            System.out.println("");
        }
    }


    public static void fibonacci() {
        int i = 1;
        int j = 1;
        int temp = 0;
        System.out.printf("%d,%d", i, j);
        for (int k = 0; k <= 15; k++) {

            temp = i + j;
            System.out.printf(", %d ", temp);
            i = j;
            j = temp;
        }

    }

    public static void pelindrom() {
        int r, sum = 0, temp;
        int n = 131;

        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome  ");
        else
            System.out.println("not palindrome");
    }


    public static void perfectnumber() {
        int j, Sum = 0;
        int a = 35;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                Sum = Sum + i;
            }
        }
        if (Sum == a) {
            System.out.format("\n% d is a Perfect Number", a);
        } else {
            System.out.format("\n% d is NOT a Perfect Number", a);
        }
    }

    public static void armstrong() {


        int n = 123, r, sum = 0, temp;

        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = sum + (r * r * r);
            n = n / 10;
        }
        if (temp == sum) {
            System.out.printf("\narmstrong  No ");
        } else {
            System.out.printf("\n not armstrong No");
        }
    }



}
