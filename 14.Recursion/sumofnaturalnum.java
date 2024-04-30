public class sumofnaturalnum {
    
    public static int sum (int n)
    {
        if(n==0)
        {
            return 1; 
        }
        int s = n + sum(n-1);
        return s;
    }

    public static void main(String[] args) {

        System.out.println(sum(5));
        
    }

}
