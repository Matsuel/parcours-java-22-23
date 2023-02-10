import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class WeddingComplex {
    public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
        Map<String,String> rep=new HashMap<>();
        for (String name: first.keySet()){
            //System.out.println(name);
            for(String values : first.get(name)){
                for (int i=0; i<name.length();i++){
                    if (name.charAt(i)== values.charAt(i)){
                        rep.put(name, values);
                    }
                }
            }
        }

        return rep;


    }
}
