import java.util.List;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {

        return a.stream().reduce((i1, i2) -> i1 ^ i2).orElse(0);

    }
}
