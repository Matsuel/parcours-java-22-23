import java.util.List;

public class ListEqual {
    public static boolean areListEquals(List<String> list1, List<String> list2) {
        if (list1==null && list2==null){
            return true;
        }else if(list1==null|| list2==null){
            return false;
        }else{
            for (int i=0;i<list1.size();i++){
                String val1= list1.get(i);
                String val2= list2.get(i);
                if(val1!=val2){
                    return false;
                }
            }
            return true;
        }
    }
}