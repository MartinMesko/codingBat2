package funkcionalneProgramovanie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MoreY<T> {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        moreY(list);
        System.out.println(list + " ");



    }

    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }

//    public static List<String> moreY2(List<String> strings)
//    {
//       return strings.stream()
//                .map(s -> "y" + s + "y")
//               .collect(Collectors.toList());
//    }
}
