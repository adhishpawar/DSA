/* Given Two Arrays A and B of Equal Length n.
 Pair each element of Array A to an Element in Array B, 
 Such that sun S of Absolute Difference of all the pairs is min*/

import java.util.*;

public class  minAbsoluteDiffPairs
{

    public static void main(String args[])
    {
        int A[] = {1,2,3};
        int B[] = {2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for(int i=0; i<A.length; i++){
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("min Absoulte: " + minDiff);
    }


}
