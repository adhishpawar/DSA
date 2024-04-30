
///***************************multiple inhgerritance as well as Hieracahial inheritance**************************************  */

public class inheritance {
    public static void main (String arhs[]){
        
        Mammals m1 = new Mammals();
        m1.walk();

        Dog d1 = new Dog();
        d1.setbreed("Afhhsdrog");
        System.out.println("Inherite from Animals Class");
        d1.eat();
    
}   

//BAse class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }

}

class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("Walks");
    }

}

class Fish extends Animal{                 //Hierarchal inheritance  1)Mammals 2)Fish 3)Bird
    
    void swim(){
        System.out.println("swim");
    }

}

class Bird extends Animal{
    
    void fly(){
        System.out.println("fly");
    }

}

class Dog extends Mammals
{
    String breed;

    void setbreed()
    {
        breed="HKLJfdsf";
        System.out.println(breed);
    }
}


