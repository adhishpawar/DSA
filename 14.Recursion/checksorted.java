//Check is array is sorted or not
public class checksorted {
    
    public static boolean isSorted(int arr[], int i)
    {
        if(i==arr.length-1)
        {
            return true;
        }

        if(arr[i] > arr[i+1])
        {
            return false;
        }

         return isSorted(arr, i+1); 
    }
    
    public static void main(String[] num) {
        int arr[] = {2,3,3,4};
        System.out.println(isSorted(arr, 0));
        
    }
}
