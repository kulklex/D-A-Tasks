import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sort {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements: %s%n", list);

        Collections.sort(list);
        System.out.printf("Sorted array elements: %s%n", list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted list elements: " + list);

        Map<String, Integer> map = new HashMap<>();
        map.put("two", 2);


        double sum = 0;
        int[] arr = {1,2,3,4,5,5,6,7};
        for (int a : arr){
            sum += a;
        }
        System.out.println(sum);
    }
}
