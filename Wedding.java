import java.util.Set;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        if (first==null)return null;
        if (second==null)return null;
        Map<String, String> rep=new HashMap<>();
        List<String> first_list= first.stream().sorted().collect(Collectors.toList());
        List<String> second_list= second.stream().sorted().collect(Collectors.toList());
        System.out.println(first_list);
        System.out.println(second_list);
        int maxLen =0;
        if (first_list.size()>second_list.size()){
            maxLen=first_list.size();
        }else{
            maxLen=second_list.size();
        }
        Random rand = new Random();      
        System.out.println(maxLen);
        for (int i=0; i<maxLen;i++){
            if (second_list.size()>1){
                int a= rand.nextInt(maxLen);
                int b= rand.nextInt(maxLen);
                String first_el= first_list.get(a);
                String second_el= second_list.get(b);
                first_list.remove(first_el);
                second_list.remove(second_el);
                rep.put(first_el, second_el);
                maxLen--;                
            }else if (first_list.size()>1){
                System.out.println("cc");
                int a= rand.nextInt(maxLen);
                String first_el= first_list.get(a);
                rep.put(first_el, null);
                first_list.remove(first_el);
                maxLen--;
            }
            System.out.println(first_list.size());
            rep.put(first_list.get(0), second_list.get(0));
            first_list.remove(first_list.get(0));
            second_list.remove(second_list.get(0));
            
        }
        return rep;
    }
}