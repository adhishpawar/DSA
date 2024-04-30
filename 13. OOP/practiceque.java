import java.util.*;

public class practiceque {
    
    calculation cs = new calculation();
    // Scanner sc = new Scanner(System.in);
    // int xr = sc.nextInt();
    // int xi = sc.nextInt();
    // int yr = sc.nextInt();
    // int yi = sc.nextInt();

    // cs.add(2,4,5,7)
    cs.sub(2,4,5,7)
    cs.mul(2,4,5,7)
}


class calculation
{
    static void add (int xr,int xi, int yr, int yi )
    {
        int sumr =  xr + yr;
        int sumi = xi + yi;

        System.out.println("Sum is" + sumr + "+"+ sumi + "i");
    }

    static void sub (int xr,int xi, int yr, int yi )
    {
        int subr;
        int subi;
        if(xr>yr)
        {
         subr =  xr - yr;
         subi = xi - yi;
        }
        else 
        {
          subr = yr - xr;
           subi = yi - xi;
        }

        System.out.println("Sub is" + subr + "+"+ subi + "i");
    }

    static void mul (int xr,int xi, int yr, int yi )
    {
        int mulr;
        int muli;

        mulr= xr*yr;
        muli=xi*yi;

        System.out.println("Multiplication is" + mulr + "+"+ muli + "i");
    }
}