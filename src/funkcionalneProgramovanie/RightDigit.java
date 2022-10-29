package funkcionalneProgramovanie;

import java.util.Arrays;
import java.util.List;

public class RightDigit {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,22,93);
        rightDigit(list);
        System.out.println(list + " ");

    }

    public static List<Integer> rightDigit(List<Integer> nums)
    {
        nums.replaceAll(integer -> integer % 10);
        return nums;
    }
}
