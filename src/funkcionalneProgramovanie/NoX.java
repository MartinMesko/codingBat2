package funkcionalneProgramovanie;

import java.util.Arrays;
import java.util.List;

public class NoX {
    public static void main(String[] args) {
        List <String> list = Arrays.asList("ax", "bb", "cx");
        nox(list);
        System.out.println(list);
    }

    public static List<String> nox (List<String> strings)
    {
        for (int i = 0; i < strings.size(); i++)
        {
            strings.set(i, strings.get(i).replace("x", ""));
        }
        return strings;
    }
}
