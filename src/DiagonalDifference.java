import java.util.List;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {

        int downToUp = 0;
        int upToDown = 0;
        int size = arr.size();

        for (int i = 0; i < size; i++) {
            upToDown += arr.get(i).get(i);
            downToUp += arr.get(i).get(size - 1 - i);
        }

        return Math.abs(downToUp - upToDown);

    }

}


