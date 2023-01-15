import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
    

       
    

    public static void reverse(Integer a []){
        Collections.reverse(Arrays.asList(a));
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        Integer [] A  = new Integer [N];
        
        for( int i = 0; i < A.length; i++){
            System.out.println("Enter " + N + " numbers... Keep typing till it reaches " + N);
            A[i] = input.nextInt();
        }

        reverse(A);
        input.close();
    }
}
