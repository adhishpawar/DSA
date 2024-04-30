import java.util.*;

public class Strings {

    // Printing all elements in String
    public static void printLetters(String str){
        for (int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();
    }
  
    public static void main(String args[]) {
        //Strings are IMMUTABLE
         
        // 1)Declaring the String 
        // String str = "abcd";
        // String str2 = new String("xyz");
        
        //2) Input output
        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.next(); ------>Only upto space occur i.e. Only one word
        // name = sc.nextLine(); ------> Will take complete line
        // System.out.print(name); 

        //3) length of String
        // String fullName = "Adhish Pawar";
        // System.out.println(fullName.length());

        // // concatenation
        // String firstName ="Adhish";
        // String lastName = "Pawar";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        //Finding the element on Specific index Using function .charAt()

        System.out.println(fullName.charAt(2));
        
        // calling the function 
        printLetters(fullName);
    }

}