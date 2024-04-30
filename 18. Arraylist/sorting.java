import java.util.ArrayList;
import java.util.Collections;

public class sorting {
   
   
    public static void main(String args[])
    {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(8);
        list.add(9);
        list.add(7);
        list.add(6);

        System.out.println("Our list : "+list);
        Collections.sort(list);
        System.out.println("After the sorting " + list);

        //decending order
        Collections.sort(list,Collections.reverseOrder());
        //Comparator--->Define logic ie .reverseOrder() 
        System.out.println(list);


    }
}
