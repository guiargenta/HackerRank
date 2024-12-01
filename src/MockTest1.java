import java.util.List;

public class MockTest1 {

    // Achar o termo mediano do array

    public static int findMedian(List<Integer> arr) {
        // Write your code here

        int size = arr.size();
        int somaTotal = 0;

        arr.sort(null);

        return arr.get(size / 2);

    }

}
