public class StringContain {
    public static boolean isStringContainedIn(String subString, String s) {
        if (subString==null){
            return (false);
        }else if (s==null){
            return (false);
        }else{
            return(s.contains(subString));
        }
    }
}