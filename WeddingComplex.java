import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class WeddingComplex {
    // public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
    //     Map<String,String> rep=new HashMap<>();
        
    //     for (String name: first.keySet()){
    //         //System.out.println(name);
    //         for(String values : first.get(name)){
    //             for (int i=0; i<name.length();i++){
    //                 if (name.charAt(i)== values.charAt(i)){
    //                     rep.put(name, values);
    //                 }
    //             }
    //         }
    //     }

        

    //     return rep;
    // }


    public static Map<String, String> createBestCouple(Map<String, List<String>> preferences1, Map<String, List<String>> preferences2) {
        Map<String, String> couples = new HashMap<>();
        Set<String> member1 = preferences1.keySet();
        Set<String> member2 = preferences2.keySet();

        for (String m1 : member1) {
            List<String> pref1 = preferences1.get(m1);
            for (String p1 : pref1) {
                if (!couples.containsKey(p1)) {
                    couples.put(m1, p1);
                    break;
                } else {
                    String m2 = couples.get(p1);
                    List<String> pref2 = preferences2.get(p1);
                    int index1 = pref2.indexOf(m1);
                    int index2 = pref2.indexOf(m2);
                    if (index1 < index2) {
                        couples.put(m1, p1);
                        couples.remove(m2);
                        break;
                    }
                }
            }
        }
        return couples;
    }
}
