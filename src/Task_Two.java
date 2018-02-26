import java.util.Scanner;


class Task_Two {


    public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner printed = new Scanner(System.in);
        double e = printed.nextDouble();

        double a;
        double n = 0;
        a = 1 / ((n * n) + (2 * n) + 1);
        do {n++;
            System.out.println("n = " + n);
            System.out.println("a = " + a + " | e = " + e);
            a = 1 / ((n * n) + (2 * n) + 1);



        }
        while (a >= e);
        System.out.println("n = " + n);
        System.out.println("a = " + a);
        System.out.println("e = " + e);

    }
}
    /*public static void main(String[] args) {

        System.out.println("Enter a number: ");
        Scanner printed = new Scanner(System.in);
        double e = printed.nextDouble();

        double a;
        double n = 1;
        a = 1 / ((n * n) + (2 * n) + 1);
        while (a >= e) {
            a = 1 / ((n * n) + (2 * n) + 1);
            n++;
        }

        System.out.println("n = " + n);
        System.out.println("a = " + a);
        System.out.println("e = " + e);

    }
}*/
