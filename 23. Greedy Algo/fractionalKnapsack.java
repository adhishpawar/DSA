import java.util.*;
//working 

public class fractionalKnapsack {
//Min weight and Max Value  

public static int fill_Knapsack(int weight[], int cost[],int capacity)
{
    int ratios[][] = new int[weight.length][2];
    int profit = 0;
    for(int i=0; i<weight.length; i++)
    {
        ratios[i][1] = cost[i]/weight[i];
    }
    System.out.println(profit);
    System.out.println("-------------------------");
    Arrays.sort(ratios,Comparator.comparingDouble(o -> o[1]));    //lambda Function

    for(int i=weight.length-1; i>=0; i--)
    {
        if(capacity >= weight[i])
        {
            System.out.println(profit);
            System.out.println("-------------------------");
            capacity = capacity - weight[i];
            profit = profit + cost[i];
            System.out.println(profit);
        }
        else
        {
            int temp = ratios[i][1];
            System.out.println(profit);
            System.out.println("-------------------------");
            profit = profit + (temp * capacity);
            System.out.println(profit);
            System.out.println("-------------------------");
            break;
        }
    }
    return profit;
}


public static void main(String args[]){

    int weight[] = {10,20,30};
    int cost[] = {60, 100, 120};
    int capacity = 50;
    int profit = fill_Knapsack(weight,cost,capacity);
    System.out.println(profit);

}



}
