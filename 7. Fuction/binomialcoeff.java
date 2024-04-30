public class binomialcoeff {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;
    }

    public static int binomial(int n, int r) {
        int n_fac = factorial(n);
        int r_fac = factorial(r);
        int fac = factorial(n - r);
        int a = (n_fac) / (r_fac * fac);
        System.out.println(a);
        return a;

    }

    public static void main(String args[]) {
        binomial(5, 2);

    }

}
