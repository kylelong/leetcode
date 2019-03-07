import java.util.HashMap;

/**
 * Created by kylel95 on 12/22/18.
 */
public class nrepeated {
    public int repeatedNTimes(int[] A) {
        int N = A.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a: A){
            if(!map.containsKey(a)){
                map.put(a, 1);
            }
            else{
                map.put(a, map.get(a) + 1);
            }
        }
        for(int k: map.keySet()){
            if(map.get(k) == N){
                return k;
            }
        }
        return 0;

    }
    public static void main(String [] args){
        int [] arr = {5,1,5,2,5,3,5,4};
        System.out.println(new nrepeated().repeatedNTimes(arr));
    }
}
