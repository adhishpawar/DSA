import java.util.*;

public class iteratoronhashmap {
    
public static void main(String[] args)
{
    HashMap<String, Integer> hm = new HashMap<>();
    hm.put("India", 100);
    hm.put("US", 50);
    hm.put("China", 150);
    hm.put("Indonedsia", 100);
    hm.put("Pakistan", 50);
    hm.put("Nepal", 150);

    //Ierator For Iterate
    Set<String> keys = hm.keySet();
    System.out.println(keys);


    //This is not regular for looop this speacially for interator class foreach

    //hm.entrySet()   ---->To call all the values for keys instead of get function
    for(String k: keys)
    {
        
        System.out.println("Key: " + k + ", Value :" + hm.get(k));
    }
}

}
