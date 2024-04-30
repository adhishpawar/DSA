///*******************************Learnt about Getters and Seters as well as Classes and object ************************************/

public class oop1{
    public static void main(String args[]){
        Pen p1 = new Pen();  ///Constructor //Created the object called p1
        p1.setColor("Blue");
        //System.out.println(p1.color); ///We can not access directly
        //So we use
        System.out.println(p1.getColor());
        p1.setTip(5);
       // System.out.println(p1.tip);     same here
       System.out.println(p1.getTip());
        // This keyword is used to reffer the cuurent object.

        // BankAccount myAcc = new BankAccount();
        // myAcc.username= "Adhishpawar";
        // // myAcc.password = "122345";  //Error found  no visibilty
        // myAcc.setPassword("awssdsdf");


    }

}

class Pen{
    private String color;
    private int tip;     ///----->this tip

    String getColor(){        //Getters
        return this.color;
    }

   int getTip(){            //Getters
        return this.tip;
    }


    void setColor(String newColor){    //Setters
        this.color= newColor;
    }

    void setTip(int tip){ //Setters
        this.tip = tip;     //the tip used with this keyword is the variable in class at above line number 2
    }                       //the tip on RHS side the tip which is passed in function setTip

}

// class BankAccount{ 
//     public String username;
//     private String password; 
//     public void setPassword(String pwd){
//         password = pwd;
//     }
  

// }

