import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sort {

    public static List<Integer> sort(List<Integer> list) {
        if (list==null)return null;
        return list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if (list==null)return null;
        return list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}