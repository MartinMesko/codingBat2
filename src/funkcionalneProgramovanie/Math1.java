package funkcionalneProgramovanie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Math1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        math1(list);


//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        math1(list);
        System.out.println(list + " ");

    }

    public static List<Integer> math1(List<Integer> nums)
    {
        nums.replaceAll(integer -> (integer + 1) * 10);
        return nums;
    }

}
