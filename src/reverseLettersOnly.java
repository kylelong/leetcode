/**
 * Created by kylel95 on 4/9/19.
 */
public class reverseLettersOnly {
    public static void main(String [] args){
        System.out.println(new reverseLettersOnly().reverseOnlyLetters("ab-cd"));
    }

    /**
     * Reverse letters by index
     * @param S
     * @return
     */
    public String reverseOnlyLetters(String S) {
        char [] arr = S.toCharArray();
        if(arr.length <= 1) return new String(arr);
        char b, e;
        int low = 0;
        int high = arr.length - 1;
        b =  arr[low];
        e = arr[high];
        while(low <= high){
            if(isLetter(b) && isLetter(e)){
                char temp = b;
                arr[low] = e;
                arr[high] = temp;
                if(low < arr.length - 1){
                    low++;
                }
                if(high > 0){
                    high--;
                }
            }
            b =  arr[low];
            e = arr[high];
            if(!isLetter(e)){
                if(high > 0){
                    high--;
                }
            }
            if(!isLetter(b)){
                if(low < arr.length - 1){
                    low++;
                }
            }
            b =  arr[low];
            e = arr[high];
        }
        return new String(arr);

    }
    public static boolean isLetter(char c){
        int code = (int)c;
        return (code >= 65 && code <= 90) || (code >= 97 && code <= 122);
    }
}

