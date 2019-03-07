import java.util.Arrays;

/**
 * Created by kylel95 on 1/19/19.
 */
public class sqauresortedarray {
    public static void main(String [] args){
        int [] A = {-4,-1,0,3,10};
       A = sortedSquares(A);
       for(int a: A){
           System.out.println(a);
       }
    }
    public static int[] sortedSquares(int[] A) {
        for(int i = 0; i < A.length; i++){
            A[i] = A[i] * A[i];
        }
        int index = 0;
        int[] sorted = new int[A.length];
        Arrays.sort(A);
        for(int a: A){
            sorted[index] = a;
            index++;
        }
        return sorted;

    }
}
