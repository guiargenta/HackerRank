import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountingSort1 {

    public static List<Integer> countingSort(List<Integer> arr) {

        List<Integer> frequencyArray = new ArrayList<Integer>(Collections.nCopies(100, 0));

        for (Integer n : arr) {
            frequencyArray.set(n, frequencyArray.get(n) + 1);
        }
        return frequencyArray;
    }
}