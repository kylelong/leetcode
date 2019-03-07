/**
 * Created by kylel95 on 2/9/19.
 */
import java.util.*;
public class addToArrayForm {
    public static void main(String [] args){
        int [] arr = {2,1,5};
        int K = 806;
        List<Integer> list = new addToArrayForm().addToArrayForm(arr, K);
        for(int l: list){
            System.out.print(l);
        }


    }
    public List<Integer> addToArrayForm(int[] A, int K) {
        int num = 0;
        int count = A.length - 1;
        for(int i = 0; i < A.length; i++){
            num += Math.pow(10, count) * A[i];
            count--;
        }
        num += K;
        List<Integer> list = new ArrayList<>();
        int n;
        while(num != 0){
            n = num % 10;
            list.add(n);
            num /= 10;
        }
        return list;


    }
}
