package DSA.Strings;

public class Palindrome {
    public static boolean check(String str){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
         return true;
    }

    public static void main(String[] args) {
        String str = "bobo";
        System.out.println(check(str));
    }
}