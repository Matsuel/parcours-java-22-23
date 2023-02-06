import java.util.List;

public class ListContains {
    public static boolean containsValue(List<Integer> list, Integer value) {
        if (list==null){
            return false;
        }else if (value==null){
            return false;
        }else{
            return list.contains(value);
        }
    }
}