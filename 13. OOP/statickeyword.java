public class statickeyword {
    public static void main(String args[]){
        Student s1 =new Student();
        s1.schoolName = "Adhish Acedmy";

        Student s2 = new Student();                 //we created the schoolname as statrci but we can havinbg value in s2.school.Name
        // System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "The new name for all object ";

        System.out.println(s2.schoolName);




        s1.markscalulator(80, 90, 54);
        s2.markscalulator(78, 63, 24);
        s3.markscalulator(64, 24 , 21);
        
    }
}

class Student{

    //Calculating marks of all students 
    static int markscalulator(int eng, int maths, int sci){
        int marks = (eng+maths+sci) / 3;
        System.out.println(marks);
        return marks;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;    
    }

    String getName(){
        return this.name;
    }
}
