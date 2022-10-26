package funkcionalneProgramovanie;

import java.util.ArrayList;
import java.util.List;

public class Square {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        square(list);
        System.out.println(list + " ");

    }
    public static List<Integer> square(List<Integer> nums) {
        nums.replaceAll(integer -> integer * integer);
        return nums;

    }
}
