/**
 * Created by kylel95 on 12/15/18.
 */
import java.util.*;
public class MinStack {
    /** initialize your data structure here. */
    ArrayList<Integer> list;
    public MinStack() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        list.remove(list.size() - 1);

    }

    public int top() {
        return list.get(list.size() - 1);
    }

    public int getMin() {
      Object [] arr = list.toArray();
      Arrays.sort(arr);
      return (int)arr[0];

    }
    public static void main(String [] args){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());  // --> Returns -3.
        minStack.pop();
        System.out.println(minStack.top());     // --> Returns 0.
        System.out.println(minStack.getMin());   //--> Returns -2.
    }

}
