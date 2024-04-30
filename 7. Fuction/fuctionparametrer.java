import java.util.*;

public class fuctionparametrer {
    public static int calulatesum(int a, int b) // parameter or formal parameter
    {
        try (Scanner sc = new Scanner(System.in)) {
            // int a = sc.nextInt();
            // int b = sc.nextInt();
            int sum = a + b;

            return sum;

        }

    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = calulatesum(a, b); // Arguments or actual parameter
            System.out.println("Sum of number is :" + sum);
            calulatesum(a, b);
        }

    }
}
