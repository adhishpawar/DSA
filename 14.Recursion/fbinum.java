public class fbinum {
    
    public static int fbiNum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1)
        {
            return 1;
        }
       int finb=fbiNum(n-1) + fbiNum(n-2);
        return finb;
    }


    public static void main(String[] args) {
        int n=25;
        System.out.println(fbiNum(n));
    }

}
