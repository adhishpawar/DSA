
public class swapint {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String args[]) {
        int a = 1;
        int b = 2;
        swap(a, b);

    }

}
