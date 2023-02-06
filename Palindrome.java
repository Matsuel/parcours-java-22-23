public class Palindrome {
    public static boolean isPalindrome(String s) {
        if (s==null){
            return false;
        }else{
            String re="";
            for(int i=s.length()-1; i>=0;i--){
                re+= s.charAt(i);
            }
            for(int i=0;i<s.length();i++){
                if (s.charAt(i)!=re.charAt(i)){
                    return false;
                }
            }
            return true;
        }
    }
}