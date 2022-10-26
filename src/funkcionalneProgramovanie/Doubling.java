package funkcionalneProgramovanie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Doubling {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);
        doubling(list);
        list.forEach(System.out::println);

    }

    public static List<Integer> doubling(List<Integer> nums) {

        nums.replaceAll(n -> n*2);
        return nums;
        }

    public static List<Integer> doubling2(List<Integer> nums)
    {
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());

    }
}
