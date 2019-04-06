/**
 * Created by kylel95 on 3/30/19.
 */
import java.math.BigInteger;
public class baseNeg2 {
    public static void main(String  [] args){
        new baseNeg2().baseNeg2(2);

    }
    public String baseNeg2(int N) {
      BigInteger num = new BigInteger(String.valueOf(N), -2);
      System.out.println(num);
      return "";
    }
}
