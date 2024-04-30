import java.util.HashMap;
public class Classroom
{
     public static void main(String[] args) {
        
        //Creating the Hash   --->O(1);
        HashMap<String,Integer> hm = new HashMap<>();


        //Putting opreration
        hm.put("India", 100);
        hm.put("US", 50);
        hm.put("China", 150);

        System.out.println(hm);

        //Get Operation
        int population = hm.get("India");
        System.out.println(population);
        

        //Conatins Key operation return the key os present or not in form of true and false

        hm.containsKey("India");
        hm.containsKey("Bharat");

        //Remove operation
        hm.remove("China");
        System.out.println(hm);

        //Size
        System.out.println(hm.size());
        
        System.out.println(hm);
        hm.put("US", 51);
        hm.put("China", 150);
        System.out.println(hm);
        

        //Is Empty
        System.out.println(hm.isEmpty());


        //Clear operations
        hm.clear();
        System.out.println(hm);
        System.out.println(hm.isEmpty());

    }

}