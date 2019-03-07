/**
 * Created by kylel95 on 12/22/18.
 */
public class maxwidthramp {
    public int maxWidthRamp(int[] A) {
        int maxDist = -1;
        boolean pos = false;
        for(int j = A.length - 1; j >= 0; j--){
            for(int i = 0; i < j; i++){
                if( A[i] <= A[j] && j - i > maxDist && i < j){
                    maxDist = j - i;
                    pos = true;
                }

            }


        }
        if(pos == false){
            return -1;
        }

        return maxDist;

    }
    public static void main(String [] args){
        int [] arr = {1, 0};
        System.out.println(new maxwidthramp().maxWidthRamp(arr));
    }
}
