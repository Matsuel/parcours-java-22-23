import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        if (amount==0) return new ArrayList<>();
        if (coins==null) return null;
        List<Integer> order_coins = coins.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(order_coins);
        List<Integer> result = new ArrayList<>();
        for(int coin: order_coins){
            while (amount-coin>=0){
                result.add(coin);
                amount=amount-coin;
            }
        }
        return result;
    }
}