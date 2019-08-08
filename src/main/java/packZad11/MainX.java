package packZad11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainX {
    public static void main(String[] args) {
        System.out.println();

        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 4));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1, 4));
        l1.removeAll(l2);
        l1.forEach(System.out::println);
    }
}
