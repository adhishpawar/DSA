//Printing number from 1 - 10  without loop
public class problem2 {
    public static void  printInc1(int n){
        if(n==10)
        {
            System.out.println(n);
            return;    
        }
        
        System.out.print(n + " ");
        printInc1(n+1);
    }

    public static void printInc2(int i){
        if(i==1)
        {
            System.out.println(i);
            return;
        }
        printInc2(i-1);
        System.out.println(i + " ");
    }

    public static void main(String args[]){
        int  n = 1;
        int i =10;

        printInc1(n);
        printInc2(i);
    }
}