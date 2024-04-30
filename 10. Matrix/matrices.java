import java.util.*;

public class matrices {
    public static boolean search(int matrix[][],int key) {
        
        for (int k = 0; k < matrix.length; k++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                if ( matrix[k][j] == key){

                System.out.println("found at cell (" + k +","+j+")" );
                return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
        
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = 3, m = 3;

        Scanner sc = new Scanner(System.in);
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < m; j++) {
                matrix[k][j] = sc.nextInt();
            }
        }
        for (int k = 0; k < n; k++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[k][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 7);
    }
}