public class x_to_power_n {
    
    public static int power(int num, int power1)
    { 
        if(power1==0)
        {
            return 1;
        }
        int val = num * power(num, power1-1);
        return val;
    }

    //optimised way  O(log n)
    public static int optimisedPower(int a, int n)
    {

        if(n==0)
        {
            return 1;
        }
        int power =  optimisedPower(a, n/2);
        int halfPowerSq = power * power;

        //n is odd numnber

        if(n % 2 != 0)
        {
            halfPowerSq = a * halfPowerSq;
        }
        
        return halfPowerSq;

    } 
    public static void main(String[] args) {
        // System.out.println( power(2,5));
        System.out.println( optimisedPower(2,30));
       
    }

}
