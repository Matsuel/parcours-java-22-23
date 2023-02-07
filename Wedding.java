import java.util.Set;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Wedding {
    public static Map<String, String> createCouple(Set<String> first, Set<String> second) {
        // if (first==null)return null;
        // if (second==null)return null;
        Map<String, String> rep=new HashMap<>();
        List<String> first_list= first.stream().sorted().collect(Collectors.toList());
        List<String> second_list= second.stream().sorted().collect(Collectors.toList());
        int maxLen =0;
        if (first_list.size()>second_list.size()){
            maxLen=first_list.size();
        }else{
            maxLen=second_list.size();
        }
        Random rand = new Random();
        if (first_list.size()==second_list.size()){
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
                }
                rep.put(first_list.get(0), second_list.get(0));
                first_list.remove(first_list.get(0));
                second_list.remove(second_list.get(0));         
            }
        }else if (first_list.size()> second_list.size()){
            int size_list= first_list.size();
            for (int i=0; i<size_list;i++){
                if (second_list.size()>1){
                    int a= rand.nextInt(first_list.size());
                    int b= rand.nextInt(second_list.size());
                    String first_el= first_list.get(a);
                    String second_el= second_list.get(b);
                    first_list.remove(first_el);
                    second_list.remove(second_el);
                    rep.put(first_el, second_el);               
                }if (second_list.size()==1){
                    int a= rand.nextInt(first_list.size());
                    String first_el= first_list.get(a);
                    rep.put(first_el, second_list.get(0));
                    first_list.remove(first_el);
                    second_list.remove(second_list.get(0));
                }if (first_list.size()>1){
                    int a= rand.nextInt(first_list.size());
                    String first_el= first_list.get(a);
                    rep.put(first_el, null);
                }if (first_list.size()==1){
                    rep.put(first_list.get(0), null);
                    first_list.remove(first_list.get(0));
                }
            }
        }else if (first_list.size()< second_list.size()){
            int size_list = second_list.size();
            for (int i =0; i<size_list;i++){
                if (first_list.size()>1){
                    int a= rand.nextInt(first_list.size());
                    int b= rand.nextInt(second_list.size());
                    String first_el= first_list.get(a);
                    String second_el= second_list.get(b);
                    first_list.remove(first_el);
                    second_list.remove(second_el);
                    rep.put(first_el, second_el);  
                }if (first_list.size()==1){
                    if (second_list.size()==1){
                        int a= rand.nextInt(first_list.size());
                        String first_el= first_list.get(a);
                        rep.put(first_el, second_list.get(0));
                        first_list.remove(first_el);
                        second_list.remove(second_list.get(0));
                    }
                }
            }
        }
        return rep;
    }
}