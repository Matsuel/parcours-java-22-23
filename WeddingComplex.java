import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WeddingComplex {
    // public static Map<String, String> createBestCouple(Map<String, List<String>> first, Map<String, List<String>> second) {
    //     Map<String,String> rep=new HashMap<>();
    //     // for (String name: first.keySet()){
    //     //     //System.out.println(name);
    //     //     for(String values : first.get(name)){
    //     //         for (int i=0; i<name.length();i++){
    //     //             if (name.charAt(i)== values.charAt(i)){
    //     //                 rep.put(name, values);
    //     //             }
    //     //         }
    //     //     }
    //     // }

    //     return rep;


    // }

    public static Map<String, String> createBestCouple(Map<String, List<String>> firstList, Map<String, List<String>> secondList) {
        Map<String, String> couple = new HashMap<>();
        Set<String> firstSet = new HashSet<>(firstList.keySet());
        Set<String> secondSet = new HashSet<>(secondList.keySet());

        while (!firstSet.isEmpty()) {
            String firstPerson = firstSet.iterator().next();
            List<String> firstPreferences = firstList.get(firstPerson);

            for (String secondPerson : firstPreferences) {
                if (secondSet.contains(secondPerson)) {
                    firstSet.remove(firstPerson);
                    secondSet.remove(secondPerson);
                    couple.put(firstPerson, secondPerson);
                    break;
                } else {
                    List<String> secondPreferences = secondList.get(secondPerson);
                    for (String thirdPerson : secondPreferences) {
                        if (couple.get(thirdPerson) == null) {
                            continue;
                        }
                        String fourthPerson = couple.get(thirdPerson);
                        if (secondList.get(secondPerson).indexOf(fourthPerson) > secondList.get(secondPerson).indexOf(firstPerson)) {
                            couple.remove(thirdPerson);
                            firstSet.remove(firstPerson);
                            secondSet.remove(secondPerson);
                            couple.put(firstPerson, secondPerson);
                            firstSet.add(thirdPerson);
                            break;
                        }
                    }
                }
            }
        }
        return couple;
    }
}
