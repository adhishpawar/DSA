public class copyconstructor {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Adhish";
        s1.roll = 456;
        s1.password ="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
          


        Student s2 = new Student(s1);          //We want to copy all the prop of s1 into s2
        s2.password ="xyz";
        
        s1.marks[2]=100;                 

        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
        

    }

}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    //************************************************************Shallow Copy constructor**************************
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    // }
    //We made change in marks of s1 but the change is also done in s2 Becuse both the objects s1 and s2 are poniting the same sturtural array
    //the shallow copy is done here    -------> o/p 100 90 100


    //***********************************************************Deep Copy Constructor********************************
    Student (Student s1){
        marks = new int[3]; 
        this.name = s1.name;
        this.roll = s1.roll; 
        for(int  i=0; i<marks.length; i++){
            this.marks[i] =s1.marks[i];                                 //o/p----->100 90 80
        }
     }   

    Student() {
        marks = new int[3];
        System.out.println("Constrctor is called.....");
    }

    Student(String name) { // Constructor //passing value
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}



///No need of destructor -----> for deleting the object to free the memory the Garbage collector is in work