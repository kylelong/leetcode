/**
 * Created by kylel95 on 12/20/18.
 */
public class palindrome {
    public static void main(String [] args){
      String s = "A man, a plan, a canal Panama";
      s = s.replaceAll("\\W", "");
      System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s){
        return s.equalsIgnoreCase(new StringBuilder().append(s).reverse().toString());
    }
//    public static String reverse(String s){
//
//    }
}
