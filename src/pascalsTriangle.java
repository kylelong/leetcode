import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kylel95 on 4/5/19.
 */
public class pascalsTriangle {

    public static void main(String [] args) {
        List<List<Integer>> list = new pascalsTriangle().generate(8);
        for(List<Integer> l: list){
            System.out.println(l + " ");
        }
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(numRows == 0) return list;
        //one
        ArrayList<Integer> one = new ArrayList<Integer>();
        one.add(1);
        list.add(one);
        if(numRows == 1) return list;
        //two
        ArrayList<Integer> two = new ArrayList<Integer>();
        two.add(1); two.add(1);
        list.add(two);
        if(numRows == 2) return list;


        for(int i = 3; i <= numRows; i++){
            int sum = 0;
            List<Integer> prev = list.get(list.size() - 1);
            ArrayList<Integer> curr = new ArrayList<Integer>();
            curr.add(1);
            for(int j = 0; j < prev.size() - 1; j++){
                    sum = prev.get(j) + prev.get(j + 1);
                    curr.add(sum);
            }
            curr.add(1);
            list.add(curr);
        }




      return list;
    }

}
