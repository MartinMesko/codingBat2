package funkcionalneProgramovanie;

import java.util.Arrays;
import java.util.List;

public class Lower {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jaro", "Peter", "Martin");
        lower(list);
        System.out.println(list + " ");

    }

    public static List<String> lower (List<String> strings)
    {
        strings.replaceAll(s -> s.toLowerCase());
        return strings;
    }
}
