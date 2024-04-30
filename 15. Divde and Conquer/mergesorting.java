public class mergesorting 
{

        public static void printArr(int arr[])
        {
            for (int i=0; i<arr.length; i++)
            {
                   System.out.print(arr[i]+ " "); 
            }
            System.out.println(); 
        }

        public static void mergesort(int arr[],int si, int ei)
        {
            if(si >= ei)
            {
                return;
            }
            int mid = si+(ei - si)/2;
            mergesort(arr, si, mid);     //left part
            mergesort(arr, mid+1, ei);   //Right part
            merge(arr,si,mid,ei);  //main sorting function
        }

        public static void merge(int arr[], int si, int mid, int ei)
        {
            int temp[] = new int[ei-si+1];    //termp arr of size total elements
            int i = si;  //for left side array
            int j= mid +1;  //for right side array 
            int k =0;   //for temp arr

            while(i<=mid && j<=ei)
            {
                if(arr[i] < arr[j])
                {
                    temp[k] = arr[i];
                    i++;
                }
                else 
                {
                    temp[k]= arr[j];
                    j++;
                }
                k++;
            }


            //For reamining elements in one part 
            //left side
            while(i <= mid)
            {
                temp[k++]= arr[i++];
            }


            //right side    
            while(j<=ei)
            {
                temp[k++] = arr[j++];
            }

            //copy the elements to main arr
            for(k=0, i=si; k<temp.length;k++,i++)
            {
                    arr[i]=temp[k];
            }    
        }

        public static void main(String args[]) 
        {
            int arr[]={6,3,9,5,2,8};
            mergesort(arr, 0, arr.length-1);
            printArr(arr);            
        }
}