/////////Constructor and parametrised constructor\\\\\\\\\

public class constructor {
    public static void main(String args[]) {
        Student s1 = new Student(); // object creation
        Student s2 = new Student("Shradha");
        Student s3 = new Student(123);
        // Student s4 = new Student ("Adhi", 987); //Error ouccured beacuse no
        // constructor is called

    }

}

class Student {
    String name;
    int roll;

    Student() {
        System.out.println("Constrctor is called.....");
    }

    Student(String name) { // Constructor //passing value
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }
}
