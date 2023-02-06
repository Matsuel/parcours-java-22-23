import java.util.ArrayList;
import java.util.List;

public class ListSearchIndex {
    public static Integer findLastIndex(List<Integer> list, Integer value) {
        if (list==null || value==null || list.isEmpty()){
            return null;
        }else{
            int index = list.lastIndexOf(value);
            if (index==-1){
                return null;
            }else{
                return index;
            }
        }
        
    }
    public static Integer findFirstIndex(List<Integer> list, Integer value) {
        if (list==null|| value==null|| list.isEmpty()){
            return null;
        }else{
            int index = list.indexOf(value);
            if (index==-1){
                return null;
            }else{
                return index;
            }
        }
        
    }
    public static List<Integer> findAllIndexes(List<Integer> list, Integer value) {
        List<Integer> positions = new ArrayList<Integer>();
        if (list==null || value==null || list.isEmpty()){
            return positions;
        }else{
            for (int i=0; i<list.size();i++){
                if (list.get(i)==value){
                    positions.add(i);
                }
            }
            return positions;
        }
    }
}