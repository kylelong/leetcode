/**
 * Created by kylel95 on 12/18/18.
 */
import java.util.*;
public class romantointeger {
    public static void main(String [] args){
 String n = "MCMXCIV";
 System.out.println(romanToInt(n));

    }
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C',100);
        map.put('D',500);
        map.put('M', 1000);
        Stack<Character> stack = new Stack<>();
//        I can be placed before V (5) and X (10) to make 4 and 9.
//        X can be placed before L (50) and C (100) to make 40 and 90.
//        C can be placed before D (500) and M (1000) to make 400 and 900.
        int number = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == 'V' || c == 'X'){
                if(!stack.isEmpty()){
                    if(stack.pop() == 'I'){
                        number -= map.get('I') * 2;
                    }
                }
            }
            if(c == 'L' || c == 'C'){
                if(!stack.isEmpty()){
                    if(stack.pop() == 'X'){
                        number -= map.get('X') * 2;
                    }
                }
            }
            if(c == 'D' || c == 'M'){
                if(!stack.isEmpty()){
                    if(stack.pop() == 'C'){
                        number -= map.get('C') * 2;
                    }
                }
            }
            stack.push(c);
            number += map.get(stack.peek());

        }
        return number;
    }
}
