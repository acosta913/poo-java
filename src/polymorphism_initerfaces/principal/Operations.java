package polymorphism_initerfaces.principal;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Operations {
    public Set<Integer> filterPairs(List<Integer> list) {
        HashSet<Integer> result = new HashSet<Integer>();
        for (Integer n : list) {
            if (n % 2 == 0) {
                result.add(n);
            }
        }
        return result;
    }
}
