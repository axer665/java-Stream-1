import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> sortArr = new ArrayList<>();

        for (Integer element : arr) {
            if (element > 0) {
                if (element % 2 == 0) {
                    sortArr.add(element);
                }
            }

        }

        Collections.sort(sortArr);

        for (Integer number : sortArr) {
            System.out.print(number + ", ");
        }

        System.out.println();

    }
}