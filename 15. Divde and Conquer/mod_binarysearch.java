public class mod_binarysearch {

    public static int search(int arr[], int tar, int si, int ei)
    {
        if(si >ei)
        {
                return -1;
        }
        int mid = si + (ei-si)/2;

        if(arr[mid] == tar)
        {
            return mid;
        }

        //Case 1
        if(arr[si] <= arr[mid])
        {
            //case a
            if(arr[si] <= tar && tar <= arr[mid-1])
            {
                return search(arr, tar, si, mid-1);
            } 
            else  //Case B 
            {
                return search(arr, tar, mid +1, ei);
            }
        }
        //case 2
        else
        {   
            //case c //Right
            if(arr[mid+1] <= tar && tar <= arr[ei])
            {
                return search(arr, tar, mid +1, ei);
            }

            //case d
            else
            {
                    return search(arr, tar, si, mid -1);
            } 
        }
        

    }


    public static void main(String args[]) 
    {
        int arr[] = {2,5,3,7,7,7,0};
        int target = 7;
        int tarIdx = search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
        
    }
}
