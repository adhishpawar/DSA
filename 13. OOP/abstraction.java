public class abstraction {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c = new Chicken();
        c.eat();
        c.walk(); 
        

        // Animal a = new Animal() {
              //We can not create the instant of animal 
        // };
    }
    
}

abstract class Animal{
    String color; 

    Animal(){    //Constructor
        color = "Brown";
    }

    void eat(){
        System.out.println("Animal eats");

    }

    abstract void walk();                                     //This is IDEA given by Animal to horse and chicken
}

class Horse extends Animal {                            //it is compalsry to implement the abstract walk function in the given horse class
    
    void changeColor()
    {
        color = "dark brown";

    }
    void walk()
    {
        System.out.println("Walks on 2 legs");           //Idea in Implemented here
    }

}

class Chicken extends Animal{                      //same for this class
    
    void changeColor(){
        color = "White";
    }

 
    void walk() {
        System.out.println("walks on 2 legs");  //.Idea is implemented here
    }
}