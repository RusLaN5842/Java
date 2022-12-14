package HomeWork_5;

import java.util.*;

public class Home1 {
    public static void main(String[] args) {
        String[] str = { "Иван Иванов = +7 988 888 33 22 +7 999 234 45 77\n" };
        String[] str2 = { "Светлана Петрова = +7 888 21 22 +7 799 231 88 33\n" };
        String[] str3 = { "Анна Мусина = +7 999 123 44 33 + 7 932 123 44 55\n" };
        String[] str4 = { "Петр Лыков = +7 234 434 34 +7 832 233 23 44\n" };
        String[] str5 = { "Марина Лугова = +7 234 434 24 +7 832 233 25 44\n" };
        String[] str6 = { "Иван Ежов = +7 234 484 34 +7 832 233 23 41" };

        ArrayList<String> subscribers = new ArrayList<>(Arrays.asList(str));
        ArrayList<String> subscribers1 = new ArrayList<>(Arrays.asList(str2));
        ArrayList<String> subscribers2 = new ArrayList<>(Arrays.asList(str3));
        ArrayList<String> subscribers3 = new ArrayList<>(Arrays.asList(str4));
        ArrayList<String> subscribers4 = new ArrayList<>(Arrays.asList(str5));
        ArrayList<String> subscribers5 = new ArrayList<>(Arrays.asList(str6));

        HashMap<Integer, ArrayList<String>> name = new HashMap<>();
        name.putIfAbsent(1, subscribers);
        name.putIfAbsent(2, subscribers1);
        name.putIfAbsent(3, subscribers2);
        name.putIfAbsent(4, subscribers3);
        name.putIfAbsent(5, subscribers4);
        name.putIfAbsent(6, subscribers5);

        System.out.println(name);

    }
}