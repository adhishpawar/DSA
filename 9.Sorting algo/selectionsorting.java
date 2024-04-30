public class selectionsorting {
    public static void selectionSorting(int arr[]){
        for(int i=0;i<arr.length;i++){
            int minPos=i;
            for(int j=i+1; j<arr.length; i++){
                if(arr[minPos]>arr[j]){
                    minPos=j; 
                }
            }
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;

        }

        public static void main(String args[]) {
            int arr[]={5,3,4,6,7};
            selecationSorting(arr);
            printArr(arr);
        
        
       }
    }
    
}
