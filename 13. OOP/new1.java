public class new1 {
    public static void main(String args[]) {
        Pen1 p1 = new Pen1("Hello");
        Pen1 p2 = new Pen1("Hello"); 
        Pen1 p4 = new Pen1(55); 
        
    }
}

class Pen1
{
    String color;
    int tip;

   Pen1(int key)
   {
    System.out.println("Constructor is called for INT");
   }
   Pen1(String hello)
   {
    System.out.println("Constructor is called for String");
   }
}


