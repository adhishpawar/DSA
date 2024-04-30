/*************************************Run Time polymorphism and complile time polymorphism*******************************************************************/


class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
} 

class Calculator{
    int sum(int a, int b){
        return a+b;

    }


    float sum(float a, float b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }
}

public class polymorphism {
    public static void main(String args[]){
        Calculator claci = new Calculator();
        System.out.println(claci.sum(1,2));                  //This all three are example of complie time polymorphism
                                                                  //Before run compler knoe that whhich function we havve to call for specifc para
        System.out.println(claci.sum((float)1.5,(float)2.5));
        System.out.println(claci.sum(1,2,3));
//*//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// */
        Deer d = new Deer();
        d.eat();                                                //Overriding
                                                                //When overrriding is there and object of child class is there then the function of child class is only called
        Animal a = new Animal();
        a.eat();
    } 
    
}