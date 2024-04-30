import java.util.ArrayList;
public class Classroom {

    public static void main(String args[]) {
        // JAVA Collection Frameworks
        // AS Cpp has vector same the Java Has Arraylist
        ArrayList<Integer> list = new ArrayList<>(); // Integer type ARRAYALIST
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // inSetion O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0);
        System.out.println("Insert operation");
        System.out.println(list);

        list.add(1, 9); // O(n)
        System.out.println("ELement 9 is added at index 1");
        System.out.println(list);

        // Get operation O(1)
        int element = list.get(2); // Access to element stored in second index saved in element
        System.out.println("GET operation");
        System.out.println(element);

        // Remove elements O(n)
        // Accesing elements by index number
        list.remove(2);
        System.out.println("Delete opr");
        System.out.println(list);

        // set operation
        // passing values of index along with new values....
        list.set(2, 3);
        System.out.println(list);

        // contain operation...
        // Return ture or false when elements is present or not..
        System.out.println("Contain opertion check whether elemnt is present or not");
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        // To access the elemnent at that index
        int new1 = list.get(1);
        System.out.println(list.get(1));
        System.out.println(new1);

        // Size operation
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at " + i + " Index");
            System.out.println(list.get(i));
        }

        // Reversing the list
        System.out.println("Elements in reversing order" );
        for (int i = list.size() - 1; i >= 0; i--) 
        {    
            System.out.println(list.get(i));
        }

        //Finding the max number in arrarlist
        int max = list.get(0);
        for(int i=0; i<list.size(); i++)
        {
           if(max < list.get(i))
           {
                max= list.get(i);
           }
        }
        System.out.println("Largest number in array is " + max);
    }
}