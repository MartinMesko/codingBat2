package funkcionalneProgramovanie;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Copies3 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Ja");
        list.add("tyty");
        copies3(list);
        System.out.println(list);


    }
    public static List<String> copies3(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        return strings;

    }
}
