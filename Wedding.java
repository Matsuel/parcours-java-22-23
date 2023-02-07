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
        Map<String, String> result=new HashMap<>();
        System.out.println(result);
        List<String> first_list= first.stream().sorted().collect(Collectors.toList());
        List<String> second_list= second.stream().sorted().collect(Collectors.toList());
        int maxLen =0;
        if (first_list.size()>second_list.size()){
            maxLen=first_list.size();
        }else{
            maxLen=second_list.size();
        }
        for (int i=0; i<maxLen;i++){
            Random rand1= new Random();
            Random rand2= new Random();
            int a= rand1.nextInt(0,first_list.size())+0;
            int b= rand2.nextInt(0,second_list.size())+0;

            result.putIfAbsent(first_list.get(a), second_list.get(b));
            

            System.out.println(first_list.get(a)+"-"+second_list.get(b));
        }
        return result;
    }
}