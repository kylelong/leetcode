import java.math.BigInteger;
import java.util.*;

/**
 * Created by kylel95 on 3/30/19.
 */
public class binaryPrefix {
    public static void main(String [] args) {
        int [] arr = {0,1,1};
        List<Boolean> list = new binaryPrefix().prefixesDivBy5(arr);
        for(boolean b: list){
            System.out.println(b);
        }

    }

    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        BigInteger num;
        BigInteger five = new BigInteger("5");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < A.length; i++){
            sb.append(A[i]);
            num = new BigInteger(sb.toString(), 2);
            if(num.mod(five).equals(BigInteger.ZERO)) list.add(true);
            else{
                list.add(false);
            }
        }
        return list;

    }

}
