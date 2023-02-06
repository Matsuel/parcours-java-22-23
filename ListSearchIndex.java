import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list==null){
            return null;
        }else if (value==null){
            return null;
        }else{
            int index=0;
            for (int i=0;i<list.size();i++){
                if (list.get(i)==value){
                    index=i;
                }
            }
            return index;
        }
        
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if(list==null){
            return null;
        }else if (value==null){
            return null;
        }else{
            for (int i=0;i<list.size();i++){
                if (list.get(i)==value){
                    return i;
                }
            }
            return null;
        }
        
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        if (list==null){
            return list;
        }else if(value==null){
            return list;
        }else{
            List<Integer> positions = new ArrayList<Integer>();
            for (int i=0; i<list.size();i++){
                if (list.get(i)==value){
                    positions.add(i);
                }
            }
            return positions;
        }
    }
}