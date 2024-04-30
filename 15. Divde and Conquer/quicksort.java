public class quicksort {
    
    public static void printArr(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) 
    {
        if(si >= ei)
        {
            return;
        }
        int pIdx=pratition(arr,si,ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei); 
    }

    public static int pratition(int arr[],int si, int ei) 
    {
        int pivot = arr[ei];
        int i = si-1;   //To make place for els smaller number than pivot

        for(int j=si; j  < ei; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                //Swapping
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei]= arr[i];
        arr[i]=temp;
        return i;

        
    }

    public static void main(String args[])
    {
        int arr[]={2,8,6,4,7,3,-1};
        printArr(arr);
        quickSort(arr,  0,  arr.length-1);
        printArr(arr);

    }


}
