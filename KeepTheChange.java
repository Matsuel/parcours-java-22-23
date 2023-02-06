import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        if (amount==0) return new ArrayList<>();
        if (coins==null) return null;
        List<Integer> result = new ArrayList<>();
        for (int coin : coins) {
            if (coin>amount) continue;
            if (coin==amount) {
                result.add(coin);
                return result;
            }
            List<Integer> subResult = computeChange(amount-coin, coins);
            if (subResult!=null) {
                result.add(coin);
                result.addAll(subResult);
                return result;
            }
        }
        return null;
    }
}