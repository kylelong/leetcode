package contest114;

/**
 * Created by kylel95 on 12/8/18.
 */
import java.util.*;
public class isSorted {
    public static void main(String [] args){
        String [] words = {"apple", "app"};

        //System.out.println(new isSorted().isAlienSorted(words, order));
    }
    public boolean isAlienSorted(String[] words, String order) {
        return false;
    }
    public static int index(String s, char c){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                return i;
            }
        }
            return 0;
    }
}
