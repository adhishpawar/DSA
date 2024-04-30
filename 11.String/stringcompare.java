public class stringcompare {
    public  static void main(String args[]) {
        String s1 = "Adhish";
        String s2 = "Adhish";
        String s3 = new String("Adhish");

        if(s1==s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("String are not equal");
        }
        if(s1==s3) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("String are not equal");
        }
        if(s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("String are not equal");
        }
        
    }
    
}
