import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        Set<Integer> set = Set.of(1, 2, 3, 4, 5);
        Map<Integer, Integer> map = Map.of(1, 11, 2, 22, 3, 33, 4, 44);
        Map<Integer, Integer> map2 = Map.ofEntries(Map.entry(1, 11), Map.entry(2, 22), Map.entry(3, 33), Map.entry(4, 44));
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println(map2);
    }
}
