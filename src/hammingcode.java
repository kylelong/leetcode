/**
 * Created by kylel95 on 12/19/18.
 */
import java.math.BigInteger;
import java.util.*;
public class hammingcode {
    public static long getHammingDistance(String first, String second){
        long count = 0;
        for(int i = 0; i < first.length(); i++){
            if(first.charAt(i) != second.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static long hammingDistance(int x, int y) {
        String s = String.valueOf(x);
        String s2 = String.valueOf(y);
        BigInteger b = new BigInteger(s);
        BigInteger c = new BigInteger(s2);
        String first = b.toString(2);
        String second = c.toString(2);
        if(second.length() > first.length()){
            int diff = second.length() - first.length();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < diff; i++){
                sb.append("0");
            }
            sb.append(first);
            first = sb.toString();
        }
        else if(first.length() > second.length()){
            int diff = first.length() - second.length();
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < diff; i++){
                sb.append("0");
            }
            sb.append(second);
            second = sb.toString();
        }
        System.out.println(first);
        System.out.println(second);
        return getHammingDistance(first, second);



    }
    public static void main(String [] args){
        int x = 1;
        int y = 4;
        System.out.println(hammingDistance(x,y));

    }
}
