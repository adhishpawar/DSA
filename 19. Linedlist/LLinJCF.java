import java.util.LinkedList; //JAVA Collection framework
public class LLinJCF {

    public static void main(String args[]) {
        //Create
        LinkedList<Integer> ll = new LinkedList<>();

        //Add Data
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        
        //Printing ll
        System.out.println(ll);


        //Remove
        ll.removeFirst();
        ll.removeLast();
        
        System.out.println(ll);
    }
}
